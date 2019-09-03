package com.mpwz.rmsnew.dao;

import com.mpwz.rmsnew.interfaces.TmonInterface;
import com.mpwz.rmsnew.repository.rms.TmonRepository;
import com.mpwz.rmsnew.utility.GlobalResources;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TmonDao {
    private Logger logger = GlobalResources.getLogger( TmonDao.class );
    @Autowired
    TmonRepository tmonRepository;

    public List<? extends TmonInterface> getAllUsers(int locCd, int consNo) {
        String methodName = "getAllUsers()";

        logger.info( methodName + "Called" );

//        List<? extends TmonInterface> tmonInterfaces = null;

        List<? extends TmonInterface> tmonInterfaces = tmonRepository.findByLocCdAndConsNo(locCd, consNo );

//        if (tmonInterfaces != null && tmonInterfaces.size() > 0) {
//            return tmonInterfaces;
//        }
        return tmonInterfaces;
    }
}
