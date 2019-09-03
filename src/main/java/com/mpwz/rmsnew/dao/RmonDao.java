package com.mpwz.rmsnew.dao;

import com.mpwz.rmsnew.interfaces.RmonInterface;
import com.mpwz.rmsnew.repository.rms.RmonRepository;
import com.mpwz.rmsnew.utility.GlobalResources;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RmonDao {
    private Logger logger = GlobalResources.getLogger( RmonDao.class );
    @Autowired
    RmonRepository rmonRepository;

    public List<? extends RmonInterface> getAllUsers(int locCd, int consNo) {
        String methodName = "getAllUsers()";

        logger.info( methodName + "Called" );

        List<? extends RmonInterface> rmonInterfaces = null;

        rmonInterfaces = rmonRepository.findByLocCdAndConsNo( locCd, consNo );

        if (rmonInterfaces != null && rmonInterfaces.size() > 0) {
            return rmonInterfaces;
        }
        return rmonInterfaces;
    }
}
