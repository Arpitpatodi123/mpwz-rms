package com.mpwz.rmsnew.dao;

import com.mpwz.rmsnew.interfaces.TconsInterface;
import com.mpwz.rmsnew.repository.rms.TconsRepository;
import com.mpwz.rmsnew.utility.GlobalResources;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TconsDao {
    private Logger logger = GlobalResources.getLogger( TconsDao.class );
    @Autowired
    TconsRepository tconsRepository;

    public List<? extends TconsInterface> getAllUsers(int locCd, int consNo) {
        String methodName = "getAllUsers()";

        logger.info( methodName + "Called" );

        List<? extends TconsInterface> tconsInterfaces = null;

        tconsInterfaces = tconsRepository.findByLocCdAndConsNo( locCd, consNo );

        if (tconsInterfaces != null && tconsInterfaces.size() > 0) {
            return tconsInterfaces;
        }
        return tconsInterfaces;
    }
}