package com.mpwz.rmsnew.repository.rms;

import com.mpwz.rmsnew.beans.rms.Tmon;
import com.mpwz.rmsnew.interfaces.TmonInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TmonRepository extends JpaRepository<Tmon, Long>
{
    public List<? extends TmonInterface> findByLocCdAndConsNo(int locCd, int consNo);
}
