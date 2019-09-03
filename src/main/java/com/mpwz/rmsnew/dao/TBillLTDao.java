package com.mpwz.rmsnew.dao;

import com.mpwz.rmsnew.interfaces.TBillLTInterface;
import com.mpwz.rmsnew.repository.sybase.TBillLTReposotory;
import com.mpwz.rmsnew.utility.GlobalResources;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TBillLTDao
{
    private Logger logger = GlobalResources.getLogger( TBillLTDao.class );
    @Autowired
    TBillLTReposotory tBillLTReposotory;

    public List<? extends TBillLTInterface> getAllUsers(String locCd, String consNo)
    {
        String methodName = "getAllUsers()";

        logger.info( methodName + "Called" );

        List<? extends TBillLTInterface> tBillLTInterfaces = null;

        tBillLTInterfaces = tBillLTReposotory.findByLocCdAndConsNo( locCd, consNo );

        return tBillLTInterfaces;
    }
}
