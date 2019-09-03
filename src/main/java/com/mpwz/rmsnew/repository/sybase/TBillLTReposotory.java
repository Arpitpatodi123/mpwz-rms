package com.mpwz.rmsnew.repository.sybase;

import com.mpwz.rmsnew.beans.sybase.TBillLT;
import com.mpwz.rmsnew.interfaces.TBillLTInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TBillLTReposotory extends JpaRepository<TBillLT, Long>
{
    public List<? extends TBillLTInterface> findByLocCdAndConsNo(String locCd, String consNo);
}
