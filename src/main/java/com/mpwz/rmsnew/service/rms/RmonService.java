package com.mpwz.rmsnew.service.rms;

import com.mpwz.rmsnew.beans.CustomBeans.Custom;
import com.mpwz.rmsnew.beans.rms.Rmon;
import com.mpwz.rmsnew.beans.rms.TCons;
import com.mpwz.rmsnew.beans.rms.TConsS;
import com.mpwz.rmsnew.beans.rms.Tmon;
import com.mpwz.rmsnew.dao.*;
import com.mpwz.rmsnew.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RmonService
{
    //RMS
    @Autowired
    private RmonDao rmonDao;
    @Autowired
    private TmonDao tmonDao;
    @Autowired
    private TconsDao tconsDao;
    @Autowired
    private TconsSDao tconsSDao;

    public CustomInterface getAllUsers(int locCd, int consNo)
    {
        //RMS
        List<? extends RmonInterface> rmonInterfaces = rmonDao.getAllUsers( locCd, consNo );
        List<? extends TmonInterface> tmonInterfaces = tmonDao.getAllUsers( locCd, consNo );
        List<? extends TconsInterface> tconsInterfaces = tconsDao.getAllUsers( locCd, consNo );
        List<? extends TconsSInterface> tconsSInterfacess = tconsSDao.getAllUsers( locCd, consNo );

        CustomInterface customInterface = new Custom();

            customInterface.setRmon( (List<Rmon>) rmonInterfaces );
            customInterface.setTmons( (List<Tmon>) tmonInterfaces );
            customInterface.settCons( (List<TCons>) tconsInterfaces );
            customInterface.settConsS( (List<TConsS>) tconsSInterfacess );

        return customInterface;
    }

//    public MasterReport getConsumerDetailReport(final String consumerNo) {
//        final String methodName = "getConsumerDetailReport() : ";
//        logger.info(methodName + "called");
//        if (StringUtils.isEmpty(consumerNo)) {
//            logger.error(methodName + "Input param(s) is null");
//            return null;
//        }
//
//        final URL reportURL = "Path to PRPT file";
//        final MasterReport report = ReportUtility.bootUpReport(reportURL);
//        final String query = "select ....................";
//
//        final SQLReportDataFactory dataFactory = ReportUtility.getDataFactory(ngbDbProperties);
//        if (dataFactory == null) {
//            logger.error(methodName + "Data factory is null");
//            return null;
//        }
//        dataFactory.setQuery("xyz", query);
//        report.setDataFactory(dataFactory);
//
//        report.getParameterValues().put("param name", "param value");
//        report.getParameterValues().put(MISConstants.TEMPLATE_VERSION, version);
//        return report;
//    }
}
