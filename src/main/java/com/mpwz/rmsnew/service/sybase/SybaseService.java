package com.mpwz.rmsnew.service.sybase;

import com.mpwz.rmsnew.beans.*;
import com.mpwz.rmsnew.beans.sybase.TBillLT;
import com.mpwz.rmsnew.beans.sybase.TConsSybase;
import com.mpwz.rmsnew.beans.sybase.TMeterDetails;
import com.mpwz.rmsnew.beans.sybase.TPayments;
import com.mpwz.rmsnew.dao.TBillLTDao;
import com.mpwz.rmsnew.dao.TConsSybaseDao;
import com.mpwz.rmsnew.dao.TMeterDetailsDao;
import com.mpwz.rmsnew.dao.TPaymentsDao;
import com.mpwz.rmsnew.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SybaseService
{
    //SYBASE
    @Autowired
    private TBillLTDao tBillLTDao;
    @Autowired
    private TConsSybaseDao tConsSybaseDao;
    @Autowired
    private TMeterDetailsDao tMeterDetailsDao;
    @Autowired
    private TPaymentsDao tPaymentsDao;

    public CustomInterface getAllUsers(String locCd, String consNo)
    {
        //SYBASE
        List<? extends TBillLTInterface> tBillLTInterfaces = tBillLTDao.getAllUsers( locCd, consNo);
        List<? extends TConsSybaseInterface> tConsSybaseInterfaces = tConsSybaseDao.getAllUsers( locCd, consNo );
        List<? extends TMeterDetailsInterface> tMeterDetailsInterfaces = tMeterDetailsDao.getAllUsers( locCd, consNo );
        List<? extends TPaymentsInterface> tPaymentsInterfaces = tPaymentsDao.getAllUsers( locCd, consNo );

        CustomInterface customInterface = new Custom();

        customInterface.settBillLT( (List<TBillLT>) tBillLTInterfaces );
        customInterface.settConsSybase( (List<TConsSybase>) tConsSybaseInterfaces );
        customInterface.settMeterDetails( (List<TMeterDetails>) tMeterDetailsInterfaces);
        customInterface.settPayments( (List<TPayments>) tPaymentsInterfaces);

        return customInterface;
    }
}
