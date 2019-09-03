package com.mpwz.rmsnew.beans.sybase;

import com.mpwz.rmsnew.interfaces.TBillLTInterface;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.sql.DataSource;

@Entity(name = "TBillLT")

@Table(name = "t_bill_lt",schema = "sybase")
public class TBillLT implements TBillLTInterface
{
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "loc_cd")
    private String locCd;

    @Column(name = "cons_num")
    private String consNo;

    @Column(name = "bill_month")
    private String billMon;

    @Column(name = "due_date")
    private String dueDate;

    @Column(name = "curr_reading")
    private String currReading;

    @Column(name = " prev_reading")
    private String prevReading;

    @Column(name = "consmp")
    private String consmp;

    @Column(name = "reading_type")
    private String readingType;

    @Column(name = " energy_chrg")
    private String  energyChrg;

    @Column(name = "meter_rent")
    private String meterRent;

    @Column(name = "elect_duty")
    private String electDuty;

    @Column(name = " fca_chrg")
    private String  fcaChrg;

    @Column(name = "pymt_amt")
    private String pymtAmt;

    @Column(name = " prev_arrear")
    private String  prevArrear;

    @Column(name = "bill_net")
    private String billNet;

    @Column(name = "sd_pymt_amt")
    private String sdPymtAmt;

    @Column(name = "reading_date")
    private String readingDate;

    @Column(name = "fixed_chrg")
    private String fixedChrg;

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

    public String getBillMon() {
        return billMon;
    }

    public void setBillMon(String billMon) {
        this.billMon = billMon;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCurrReading() {
        return currReading;
    }

    public void setCurrReading(String currReading) {
        this.currReading = currReading;
    }

    public String getPrevReading() {
        return prevReading;
    }

    public void setPrevReading(String prevReading) {
        this.prevReading = prevReading;
    }

    public String getConsmp() {
        return consmp;
    }

    public void setConsmp(String consmp) {
        this.consmp = consmp;
    }

    public String getReadingType() {
        return readingType;
    }

    public void setReadingType(String readingType) {
        this.readingType = readingType;
    }

    public String getEnergyChrg() {
        return energyChrg;
    }

    public void setEnergyChrg(String energyChrg) {
        this.energyChrg = energyChrg;
    }

    public String getMeterRent() {
        return meterRent;
    }

    public void setMeterRent(String meterRent) {
        this.meterRent = meterRent;
    }

    public String getElectDuty() {
        return electDuty;
    }

    public void setElectDuty(String electDuty) {
        this.electDuty = electDuty;
    }

    public String getFcaChrg() {
        return fcaChrg;
    }

    public void setFcaChrg(String fcaChrg) {
        this.fcaChrg = fcaChrg;
    }

    public String getPymtAmt() {
        return pymtAmt;
    }

    public void setPymtAmt(String pymtAmt) {
        this.pymtAmt = pymtAmt;
    }

    public String getPrevArrear() {
        return prevArrear;
    }

    public void setPrevArrear(String prevArrear) {
        this.prevArrear = prevArrear;
    }

    public String getBillNet() {
        return billNet;
    }

    public void setBillNet(String billNet) {
        this.billNet = billNet;
    }

    public String getSdPymtAmt() {
        return sdPymtAmt;
    }

    public void setSdPymtAmt(String sdPymtAmt) {
        this.sdPymtAmt = sdPymtAmt;
    }

    public String getReadingDate() {
        return readingDate;
    }

    public void setReadingDate(String readingDate) {
        this.readingDate = readingDate;
    }

    public String getFixedChrg() {
        return fixedChrg;
    }

    public void setFixedChrg(String fixedChrg) {
        this.fixedChrg = fixedChrg;
    }

    @Override
    public String toString() {
        return "TBillLT{" +
                "id=" + id +
                ", locCd='" + locCd + '\'' +
                ", consNo='" + consNo + '\'' +
                ", billMon='" + billMon + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", currReading='" + currReading + '\'' +
                ", prevReading='" + prevReading + '\'' +
                ", consmp='" + consmp + '\'' +
                ", readingType='" + readingType + '\'' +
                ", energyChrg='" + energyChrg + '\'' +
                ", meterRent='" + meterRent + '\'' +
                ", electDuty='" + electDuty + '\'' +
                ", fcaChrg='" + fcaChrg + '\'' +
                ", pymtAmt='" + pymtAmt + '\'' +
                ", prevArrear='" + prevArrear + '\'' +
                ", billNet='" + billNet + '\'' +
                ", sdPymtAmt='" + sdPymtAmt + '\'' +
                ", readingDate='" + readingDate + '\'' +
                ", fixedChrg='" + fixedChrg + '\'' +
                '}';
    }
}
