package com.mpwz.rmsnew.dao;

import com.mpwz.rmsnew.interfaces.TPaymentsInterface;
import com.mpwz.rmsnew.repository.sybase.TPaymentsRepository;
import com.mpwz.rmsnew.utility.GlobalResources;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TPaymentsDao
{
    private Logger logger = GlobalResources.getLogger( TPaymentsDao.class );
    @Autowired
    TPaymentsRepository tPaymentsRepository;

    public List<? extends TPaymentsInterface> getAllUsers(String locCd, String consNo)
    {
        String methodName = "getAllUsers()";
        logger.info( methodName + "Called" );
        List<? extends TPaymentsInterface> tPaymentsInterfaces =null;
        tPaymentsInterfaces=tPaymentsRepository.findByLocCdAndConsNo( locCd,consNo );
        return tPaymentsInterfaces;
    }
}
