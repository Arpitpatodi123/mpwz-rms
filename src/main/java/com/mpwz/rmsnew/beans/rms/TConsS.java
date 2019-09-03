package com.mpwz.rmsnew.beans.rms;

import com.mpwz.rmsnew.interfaces.TconsSInterface;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "TConsS")
@Table(name = "t_cons_s", schema = "rms")
public class TConsS implements TconsSInterface
{
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "cons_no")
    private int consNo;

    @Column(name = "loc_cd")
    private int locCd;

    @Column(name = "phase_typ")
    private int phaseTyp;

    @Column(name = "mob_no")
    private String mobNo;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int getConsNo() {
        return consNo;
    }

    @Override
    public void setConsNo(int consNo) {
        this.consNo = consNo;
    }

    @Override
    public int getLocCd() {
        return locCd;
    }

    @Override
    public void setLocCd(int locCd) {
        this.locCd = locCd;
    }

    public int getPhaseTyp() {
        return phaseTyp;
    }

    public void setPhaseTyp(int phaseTyp) {
        this.phaseTyp = phaseTyp;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    @Override
    public String toString() {
        return "TConsS{" +
                "id=" + id +
                ", consNo=" + consNo +
                ", locCd=" + locCd +
                ", phaseTyp=" + phaseTyp +
                ", mobNo='" + mobNo + '\'' +
                '}';
    }
}

