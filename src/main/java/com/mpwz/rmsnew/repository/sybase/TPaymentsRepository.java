package com.mpwz.rmsnew.repository.sybase;

import com.mpwz.rmsnew.beans.sybase.TPayments;
import com.mpwz.rmsnew.interfaces.TPaymentsInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TPaymentsRepository extends JpaRepository<TPayments, Long>
{
    public List<? extends TPaymentsInterface> findByLocCdAndConsNo(String locCd, String consNo);
}
