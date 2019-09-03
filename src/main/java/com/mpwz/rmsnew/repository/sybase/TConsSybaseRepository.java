package com.mpwz.rmsnew.repository.sybase;

import com.mpwz.rmsnew.beans.sybase.TConsSybase;
import com.mpwz.rmsnew.interfaces.TConsSybaseInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TConsSybaseRepository extends JpaRepository<TConsSybase, Long>
{
    public List<? extends TConsSybaseInterface> findByLocCdAndConsNo(String locCd, String consNo);
}
