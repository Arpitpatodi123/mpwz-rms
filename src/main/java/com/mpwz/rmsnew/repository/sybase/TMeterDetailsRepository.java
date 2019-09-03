package com.mpwz.rmsnew.repository.sybase;

import com.mpwz.rmsnew.beans.sybase.TMeterDetails;
import com.mpwz.rmsnew.interfaces.TMeterDetailsInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TMeterDetailsRepository extends JpaRepository<TMeterDetails, Long>
{
    public List<? extends TMeterDetailsInterface> findByLocCdAndConsNo(String locCd, String consNo);
}
