package com.mpwz.rmsnew.dao;

import com.mpwz.rmsnew.interfaces.TMeterDetailsInterface;
import com.mpwz.rmsnew.repository.sybase.TMeterDetailsRepository;
import com.mpwz.rmsnew.utility.GlobalResources;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TMeterDetailsDao
{
    private Logger logger = GlobalResources.getLogger( TMeterDetailsDao.class );
    @Autowired
    TMeterDetailsRepository tMeterDetailsRepository;

    public List<? extends TMeterDetailsInterface> getAllUsers(String locCd, String consNo)
    {
        String methodName = "getAllUsers()";

        logger.info( methodName + "Called" );

        List<? extends TMeterDetailsInterface> tMeterDetailsInterfaces = null;
        tMeterDetailsInterfaces = tMeterDetailsRepository.findByLocCdAndConsNo( locCd, consNo );

        return tMeterDetailsInterfaces;
    }
}
