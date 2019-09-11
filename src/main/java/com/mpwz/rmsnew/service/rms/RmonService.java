package com.mpwz.rmsnew.service.rms;
//RMS
import com.mpwz.rmsnew.beans.CustomBeans.Custom;
import com.mpwz.rmsnew.beans.rms.Rmon;
import com.mpwz.rmsnew.beans.rms.TCons;
import com.mpwz.rmsnew.beans.rms.TConsS;
import com.mpwz.rmsnew.beans.rms.Tmon;
import com.mpwz.rmsnew.configuration.datasource.rms.RMSDBconfig;
import com.mpwz.rmsnew.dao.*;
import com.mpwz.rmsnew.interfaces.*;
import com.mpwz.rmsnew.utility.ReportUtility;
import org.pentaho.reporting.engine.classic.core.MasterReport;
import org.pentaho.reporting.engine.classic.core.modules.misc.datafactory.sql.SQLReportDataFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;
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
    @Autowired
    private RMSDBconfig rmsdBconfig;
    @Value( "classpath:templates" )
    private String templatepath;

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

    //RMS Report pentaho

    public MasterReport getConsumerDetailReport( int consNo,  int locCd) throws Exception
    {
        final String methodName = "getConsumerDetailReport() : ";
//        logger.info(methodName + "called");
//        if (StringUtils.isEmpty(consumerNo)) {
//            logger.error(methodName + "Input param(s) is null");
//            return null;
//        }

        //Pentaho report path
        System.out.println("template path   " +templatepath);
        //final URL reportURL = ResourceUtils.getURL( templatepath+"/"+"rms_passbook.prpt" );

            String path = templatepath+"/"+"rms_passbook.prpt";
            path = path.substring("classpath:".length());
            ClassLoader cl = ClassUtils.getDefaultClassLoader();
            URL url = (cl != null ? cl.getResource(path) : ClassLoader.getSystemResource(path));
            if (url == null) {
                String description = "class path resource [" + path + "]";
                throw new FileNotFoundException(description +
                        " cannot be resolved to URL because it does not exist");
            }

        System.out.println("path = " +templatepath+"/"+"rms_passbook.prpt");
        System.out.println("url="+ url.getPath());
        final MasterReport report = ReportUtility.bootUpReport(url);

        //Pentaho report query

        final String query = "select\n" +
                "a.bill_mon,\n" +
                "a.loc_cd,\n" +
                "a.cons_no ,\n" +
                "a.loc_desc,\n" +
                "a.cons_name,\n" +
                "a.add1,\n" +
                "a.add2,\n" +
                "a.city, \n" +
                "a.gr_no,\n" +
                "a.rd_no,\n" +
                "a.trf_catg,\n" +
                "a.load1, \n" +
                "a.load_unit_cd,\n" +
                "a.phase_cd,\n" +
                "a.first_cash_due_date, \n" +
                "a.rdg_typ_cd,\n" +
                "a.mtr_typ,\n" +
                "a.mtr_no,\n" +
                "a.make,\n" +
                "a.mf, \n" +
                "a.prev_rdg,\n" +
                "a.curr_rdg, \n" +
                "a.ass_consmp,\n" +
                "a.mtr_consmp,\n" +
                "a.fca, \n" +
                "a.energy_chrg,\n" +
                "a.mtr_rent,\n" +
                "a.prev_arr,\n" +
                "a.adj_amt,\n" +
                "a.bill_net,\n" +
                "a.rdg_dt,\n" +
                "a.fixed_charge,\n" +
                "a.curr_demand,\n" +
                "a.area_name,\n" +
                "b.duty,\n" +
                "b.sd_held,\n" +
                "b.bill_mon,\n" +
                "b.tot_amt_paid,\n" +
                "d.phase_typ,\n" +
                "d.mob_no,\n" +
                "e.conn_date,\n" +
                "e.cons_sta_cd,\n" +
                "b.demand_id,\n" +
                "a.bill_net-b.tot_amt_paid as \"Balance\"\n" +
                "   from \n" +
                "   rms.rmon a \n" +
                "   inner join rms.tmon b on a.cons_no =  b.cons_cons_no\n" +
                "   \tand a.bill_mon = b.bill_mon and a.loc_cd = b.cons_loc_cd\n" +
                "   inner join rms.t_cons_s d on a.cons_no = d.cons_no \n" +
                "\tand a.loc_cd = d.loc_cd\n" +
                "   inner join rms.t_cons e on a.cons_no = e.cons_no \n" +
                "\tand a.loc_cd = e.loc_cd\n" +
                "   where a.cons_no = '?' and a.loc_cd = '?' order by a.bill_mon desc\n" +
                " \n";

        final SQLReportDataFactory dataFactory = ReportUtility.getDataFactory(rmsdBconfig);
        if (dataFactory == null)
        {
            //logger.error(methodName + "Data factory is null");
            return null;
        }
        dataFactory.setQuery("consumer_details_rms", query);
        report.setDataFactory(dataFactory);

        //report.getParameterValues().put("param name", "param value");
        //report.getParameterValues().put(MISConstants.TEMPLATE_VERSION, version);
        return report;
    }
}