package com.mpwz.rmsnew.repository.rms;

import com.mpwz.rmsnew.beans.rms.TConsS;
import com.mpwz.rmsnew.interfaces.TconsSInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TConsSRepository extends JpaRepository<TConsS, Long>
{
    public List<? extends TconsSInterface> findByLocCdAndConsNo(int locCd, int consNo);
}
