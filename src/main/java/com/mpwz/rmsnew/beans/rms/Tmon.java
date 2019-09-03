package com.mpwz.rmsnew.beans.rms;

import com.mpwz.rmsnew.interfaces.TmonInterface;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity(name = "tmon")
@Table(name = "tmon", schema = "rms")
public class Tmon implements TmonInterface
{
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "cons_loc_cd")
    private int locCd;

    @Column(name = "cons_cons_no")
    private int consNo;

    @Column(name = "duty")
    private String duty;

    @Column(name = "sd_held")
    private int sdHeld;

    @Column(name = "bill_mon")
    private Date billMon;

    @Column(name = "tot_amt_paid")
    private int totAmtPaid;

    @Column(name = "demand_id")
    private int demandId;

    @Column(name = "last_pymt_rect_no")
    private String lastPymtRectNo;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int getLocCd() {
        return locCd;
    }

    @Override
    public void setLocCd(int locCd) {
        this.locCd = locCd;
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
    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    @Override
    public int getSdHeld() {
        return sdHeld;
    }

    @Override
    public void setSdHeld(int sdHeld) {
        this.sdHeld = sdHeld;
    }

    @Override
    public Date getBillMon() {
        return billMon;
    }

    @Override
    public void setBillMon(Date billMon) {
        this.billMon = billMon;
    }

    @Override
    public int getTotAmtPaid() {
        return totAmtPaid;
    }

    @Override
    public void setTotAmtPaid(int totAmtPaid) {
        this.totAmtPaid = totAmtPaid;
    }

    @Override
    public int getDemandId() {
        return demandId;
    }

    @Override
    public void setDemandId(int demandId) {
        this.demandId = demandId;
    }

    @Override
    public String getLastPymtRectNo() {
        return lastPymtRectNo;
    }

    public void setLastPymtRectNo(String lastPymtRectNo) {
        this.lastPymtRectNo = lastPymtRectNo;
    }

    @Override
    public String toString() {
        return "Tmon{" +
                "id=" + id +
                ", locCd=" + locCd +
                ", consNo=" + consNo +
                ", duty='" + duty + '\'' +
                ", sdHeld=" + sdHeld +
                ", billMon=" + billMon +
                ", totAmtPaid=" + totAmtPaid +
                ", demandId=" + demandId +
                ", lastPymtRectNo='" + lastPymtRectNo + '\'' +
                '}';
    }
}

