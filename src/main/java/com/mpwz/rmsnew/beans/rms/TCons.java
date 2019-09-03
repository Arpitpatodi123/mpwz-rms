package com.mpwz.rmsnew.beans.rms;

import com.mpwz.rmsnew.interfaces.TconsInterface;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity(name = "Tcons")
@Table(name = "t_cons", schema = "rms")
public class TCons implements TconsInterface
{
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "cons_no")
    private int consNo;

    @Column(name = "loc_cd")
    private int locCd;

    @Column(name ="conn_date")
    private Date connDate;

    @Column(name = "cons_sta_cd")
    private int consStaCd;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public int getConsNo() {
        return consNo;
    }

    public void setConsNo(int consNo) {
        this.consNo = consNo;
    }

    public int getLocCd() {
        return locCd;
    }

    public void setLocCd(int locCd) {
        this.locCd = locCd;
    }

    @Override
    public Date getConnDate() {
        return connDate;
    }

    @Override
    public void setConnDate(Date connDate) {
        this.connDate = connDate;
    }

    @Override
    public int getConsStaCd() {
        return consStaCd;
    }

    @Override
    public void setConsStaCd(int consStaCd) {
        this.consStaCd = consStaCd;
    }

    @Override
    public String toString() {
        return "TCons{" +
                "id=" + id +
                ", consNo=" + consNo +
                ", locCd=" + locCd +
                ", connDate=" + connDate +
                ", consStaCd=" + consStaCd +
                '}';
    }
}

