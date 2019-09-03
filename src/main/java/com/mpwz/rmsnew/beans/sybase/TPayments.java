package com.mpwz.rmsnew.beans.sybase;

import com.mpwz.rmsnew.interfaces.TPaymentsInterface;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "TPayments")
@Table(name = "t_payment", schema = "sybase")
public class TPayments implements TPaymentsInterface
{
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "loc_cd")
    private String locCd;

    @Column(name = "cons_num")
    private String consNo;

    @Column(name = " pymt_date")
    private String  pymtDate;

    @Column(name = " t_window")
    private String  tWindow;

    @Column(name = "sr_num")
    private String srNum;

    @Column(name = "pymt_amt")
    private String pymtAmt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    public String getConsNo() {
        return consNo;
    }

    public void setConsNo(String consNo) {
        this.consNo = consNo;
    }

    public String getPymtDate() {
        return pymtDate;
    }

    public void setPymtDate(String pymtDate) {
        this.pymtDate = pymtDate;
    }

    public String gettWindow() {
        return tWindow;
    }

    public void settWindow(String tWindow) {
        this.tWindow = tWindow;
    }

    public String getSrNum() {
        return srNum;
    }

    public void setSrNum(String srNum) {
        this.srNum = srNum;
    }

    public String getPymtAmt() {
        return pymtAmt;
    }

    public void setPymtAmt(String pymtAmt) {
        this.pymtAmt = pymtAmt;
    }

    @Override
    public String toString() {
        return "TPayments{" +
                "id=" + id +
                ", locCd='" + locCd + '\'' +
                ", consNo='" + consNo + '\'' +
                ", pymtDate='" + pymtDate + '\'' +
                ", tWindow='" + tWindow + '\'' +
                ", srNum='" + srNum + '\'' +
                ", pymtAmt='" + pymtAmt + '\'' +
                '}';
    }
}
