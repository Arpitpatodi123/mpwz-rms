package com.mpwz.rmsnew.dao;

import com.mpwz.rmsnew.interfaces.TconsSInterface;
import com.mpwz.rmsnew.repository.rms.TConsSRepository;
import com.mpwz.rmsnew.utility.GlobalResources;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TconsSDao {
    private Logger logger = GlobalResources.getLogger( TconsSDao.class );
    @Autowired
    TConsSRepository tConsSRepository;

    public List<? extends TconsSInterface> getAllUsers(int locCd, int consNo) {
        String methodName = "getAllUsers()";

        logger.info( methodName + "Called" );

        List<? extends TconsSInterface> tconsSInterfaces = null;

        tconsSInterfaces = tConsSRepository.findByLocCdAndConsNo( locCd, consNo );

//        if (tconsSInterfaces != null && tconsSInterfaces.size() > 0) {
//            return tconsSInterfaces;
//        }
        return tconsSInterfaces;
    }
}
