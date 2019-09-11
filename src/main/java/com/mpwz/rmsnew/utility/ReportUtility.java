package com.mpwz.rmsnew.utility;


import com.mpwz.rmsnew.interfaces.DBProperties;
import org.pentaho.reporting.engine.classic.core.ClassicEngineBoot;
import org.pentaho.reporting.engine.classic.core.MasterReport;
import org.pentaho.reporting.engine.classic.core.ReportProcessingException;
import org.pentaho.reporting.engine.classic.core.cache.DataCacheFactory;
import org.pentaho.reporting.engine.classic.core.modules.misc.datafactory.sql.DriverConnectionProvider;
import org.pentaho.reporting.engine.classic.core.modules.misc.datafactory.sql.SQLReportDataFactory;
import org.pentaho.reporting.engine.classic.core.modules.output.pageable.pdf.PdfReportUtil;
import org.pentaho.reporting.engine.classic.core.modules.output.table.html.HtmlReportUtil;
import org.pentaho.reporting.engine.classic.core.modules.output.table.xls.ExcelReportUtil;
import org.pentaho.reporting.libraries.resourceloader.Resource;
import org.pentaho.reporting.libraries.resourceloader.ResourceManager;
import org.slf4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;

import javax.swing.table.DefaultTableModel;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ReportUtility {

    private static final Logger logger = GlobalResources.getLogger(ReportUtility.class);

    private static final ClassicEngineBoot PENTAHO_ENGINE = ClassicEngineBoot.getInstance();

    /**
     * Get master report
     *
     * @param reportURL
     * @return
     * @throws Exception
     */
    public static MasterReport bootUpReport(final URL reportURL) {
        final String methodName = "bootUpReport() : ";
        logger.info(methodName + "called");
        if (reportURL == null) {
            logger.error(methodName + "Report URL is null");
            return null;
        }
        if (!PENTAHO_ENGINE.isBootDone()) {
            logger.info(methodName + "############## Pentaho Engine Starting ##############");
            PENTAHO_ENGINE.start();
            logger.info(methodName + "############## Pentaho Engine Started. ##############");
        }
        MasterReport report = null;
        DataCacheFactory.getCache().getCacheManager().clearAll();
        try {
            final Resource resource = new ResourceManager().createDirectly(reportURL, MasterReport.class);
            report = (MasterReport) resource.getResource();
        } catch (Exception exception) {
            logger.error(methodName + exception.getMessage());
        }
        return report;
    }

    /**
     * Get SQL data factory
     *
     * @param dbProperties
     * @return
     * @throws Exception
     */
    public static SQLReportDataFactory getDataFactory(final DBProperties dbProperties) {
        final String methodName = "getDataFactory() : ";
        logger.info(methodName + "called");
        if (dbProperties == null) {
            logger.error(methodName + "Database properties are null");
            return null;
        }
        final DriverConnectionProvider provider = new DriverConnectionProvider();
        provider.setDriver(dbProperties.getDriver());
        provider.setProperty("user", dbProperties.getUsername());
        provider.setProperty("password", dbProperties.getPassword());
        provider.setUrl(dbProperties.getUrl());
        return new SQLReportDataFactory(provider);
    }


    /**
     * Close SQL data factory
     *
     * @param report
     * @throws Exception
     */
    public static void cleanup(final MasterReport report) {
        final String methodName = "cleanup() : ";
        logger.info(methodName + "called");
        if (report == null) {
            logger.error(methodName + "Master report is null");
            return;
        }
        if (report.getResourceManager() != null) {
            report.getResourceManager().getBundleCache().clear();
            report.getResourceManager().getDataCache().clear();
            report.getResourceManager().getFactoryCache().clear();
        }
        if (report.getDataFactory() != null) {
            report.getDataFactory().close();
        }
    }

    /**
     * Get output stream from report
     *
     * @param report
     * @param fileFormat
     * @return
     */
    public static ByteArrayOutputStream getOutputStream(final MasterReport report, final String fileFormat) {
        final String methodName = "getOutputStream() : ";
        logger.info(methodName + "called");
        if (report == null || fileFormat == null) {
            logger.error(methodName + "Master report / file format is null");
            return null;
        }
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            if ("PDF".equals(fileFormat)) {
                PdfReportUtil.createPDF(report, out);
            } else if ("XLSX".equals(fileFormat)) {
                ExcelReportUtil.createXLSX(report, out);
            } else if ("HTML".equals(fileFormat)) {
                HtmlReportUtil.createStreamHTML(report, out);
            } else {
                logger.error(methodName + "Unsupported file format " + fileFormat);
            }
        } catch (ReportProcessingException exception) {
            logger.error(methodName + exception.getMessage());
        }
        return out;
    }

    /**
     * Get bytes from report
     *
     * @param report
     * @param fileFormat
     * @return
     */
    public static byte[] getBytesFromReport(final MasterReport report, final String fileFormat) {
        final String methodName = "getBytesFromReport() : ";
        logger.info(methodName + "called");
        if (report == null || StringUtils.isEmpty(fileFormat)) {
            logger.error(methodName + "Input param(s) is null");
            return null;
        }
        byte[] bytes = null;
        try (ByteArrayOutputStream outputStream = getOutputStream(report, fileFormat)) {
            if (outputStream != null) {
                bytes = outputStream.toByteArray();
            }
        } catch (IOException exception) {
            logger.error(methodName + exception.getMessage());
        }
        return bytes;
    }


    public static ResponseEntity getResponseFromReport(final MasterReport report, final String fileFormat) {
        final String methodName = "getResponseFromReport() : ";
        logger.info(methodName + "called");
        ResponseEntity<?> responseEntity = null;
        if (report == null || fileFormat == null) {
            logger.error(methodName + "Master report / file format is null");
            responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            final byte[] out = ReportUtility.getBytesFromReport(report, fileFormat);
            if (out == null) {
                logger.error(methodName + "No report generated. Internal error occurred");
                responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            } else {
                logger.info(methodName + "Report Created");
                HttpHeaders header = new HttpHeaders();
                if ("PDF".equals(fileFormat)) {
                    header.setContentType( MediaType.APPLICATION_PDF );
                } else if ("XLSX".equals(fileFormat)) {
                    header.setContentType( MediaType.APPLICATION_OCTET_STREAM );
                } else if ("HTML".equals(fileFormat)) {
                    header.setContentType( MediaType.TEXT_HTML );
                } else {
                    logger.error(methodName + "Unsupported file format " + fileFormat);
                }
                responseEntity = new ResponseEntity<>(out, header, HttpStatus.OK);
            }
        }
        return responseEntity;
    }
}
