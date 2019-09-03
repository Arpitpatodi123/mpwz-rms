package com.mpwz.rmsnew.repository.rms;

import com.mpwz.rmsnew.beans.rms.TCons;
import com.mpwz.rmsnew.interfaces.TconsInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TconsRepository extends JpaRepository<TCons, Long>
{
    public List<? extends TconsInterface> findByLocCdAndConsNo(int locCd, int consNo);
}
