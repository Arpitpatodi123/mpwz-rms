package com.mpwz.rmsnew.beans.sybase;

import com.mpwz.rmsnew.interfaces.TMeterDetailsInterface;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "TMeterDetails")
@Table(name = "t_meter_details", schema = "sybase")
public class TMeterDetails implements TMeterDetailsInterface
{
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "loc_cd")
    private String locCd;

    @Column(name = "cons_num")
    private String consNo;

    @Column(name = "meter_type")
    private String meterType;

    @Column(name = "meter_num")
    private String meterNum;

    @Column(name = "make")
    private String make;

    @Column(name = "mult_factor")
    private String multFactor;

    @Column(name = "inst_date")
    private String instDate;

    @Column(name = "meter_phases")
    private String meterPhases;

    @Column(name = "meter_status")
    private String meterStatus;

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

    public String getMeterType() {
        return meterType;
    }

    public void setMeterType(String meterType) {
        this.meterType = meterType;
    }

    public String getMeterNum() {
        return meterNum;
    }

    public void setMeterNum(String meterNum) {
        this.meterNum = meterNum;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMultFactor() {
        return multFactor;
    }

    public void setMultFactor(String multFactor) {
        this.multFactor = multFactor;
    }

    public String getInstDate() {
        return instDate;
    }

    public void setInstDate(String instDate) {
        this.instDate = instDate;
    }

    public String getMeterPhases() {
        return meterPhases;
    }

    public void setMeterPhases(String meterPhases) {
        this.meterPhases = meterPhases;
    }

    public String getMeterStatus() {
        return meterStatus;
    }

    public void setMeterStatus(String meterStatus) {
        this.meterStatus = meterStatus;
    }

    @Override
    public String toString() {
        return "TMeterDetails{" +
                "id=" + id +
                ", locCd='" + locCd + '\'' +
                ", consNo='" + consNo + '\'' +
                ", meterType='" + meterType + '\'' +
                ", meterNum='" + meterNum + '\'' +
                ", make='" + make + '\'' +
                ", multFactor='" + multFactor + '\'' +
                ", instDate='" + instDate + '\'' +
                ", meterPhases='" + meterPhases + '\'' +
                ", meterStatus='" + meterStatus + '\'' +
                '}';
    }
}
