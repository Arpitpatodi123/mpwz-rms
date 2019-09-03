package com.mpwz.rmsnew.repository.rms;

import com.mpwz.rmsnew.beans.rms.Rmon;
import com.mpwz.rmsnew.interfaces.RmonInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RmonRepository extends JpaRepository<Rmon, Long> {

    public List<? extends RmonInterface> findByLocCdAndConsNo(int locCd, int consNo);

//    public RmonInterface findByLocCdAndConsNo(int locCd, int consNo);

   //@Query(value="select loc_cd, cons_no, bill_mon, cons_name from ind_east.rmon where loc_cd =? and cons_no = ?",nativeQuery = true)
   //public List getDataForNative();
}
