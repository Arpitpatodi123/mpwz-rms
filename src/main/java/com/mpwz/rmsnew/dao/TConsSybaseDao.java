package com.mpwz.rmsnew.dao;

import com.mpwz.rmsnew.interfaces.TConsSybaseInterface;
import com.mpwz.rmsnew.repository.sybase.TConsSybaseRepository;
import com.mpwz.rmsnew.utility.GlobalResources;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TConsSybaseDao
{
    private Logger logger = GlobalResources.getLogger( TConsSybaseDao.class );
    @Autowired
    TConsSybaseRepository tConsSybaseRepository;

    public List<? extends TConsSybaseInterface> getAllUsers(String locCd, String consNo)
    {
        String methodName = "getAllUsers()";

        logger.info( methodName + "Called" );

        List<? extends TConsSybaseInterface> tConsSybaseInterfaces = null;

        tConsSybaseInterfaces = tConsSybaseRepository.findByLocCdAndConsNo( locCd, consNo );

        return tConsSybaseInterfaces;
    }
}
