package com.mpwz.rmsnew.repository.rms;

import com.mpwz.rmsnew.beans.rms.Rmon;
import com.mpwz.rmsnew.interfaces.RmonInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RmonRepository extends JpaRepository<Rmon, Long> {

    public List<? extends RmonInterface> findByLocCdAndConsNo(int locCd, int consNo);

}
