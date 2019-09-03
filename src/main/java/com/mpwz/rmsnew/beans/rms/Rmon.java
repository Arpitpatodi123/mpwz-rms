package com.mpwz.rmsnew.beans.rms;
import com.mpwz.rmsnew.interfaces.RmonInterface;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity(name = "Rmon")
@Table(name = "rmon", schema = "rms")
public class Rmon implements RmonInterface
{
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "bill_mon")
    private Date billMon;

    @Column(name = "loc_cd")
    private int locCd;

    @Column(name = "cons_no")
    private int consNo;

    @Column(name = "loc_desc")
    private String locDesc;

    @Column(name = "cons_name")
    private String consName;

    @Column(name = "add1")
    private String add1;

    @Column(name = "add2")
    private String add2;

    @Column(name = "city")
    private String city;

    @Column(name = "gr_no")
    private int grNo;

    @Column(name = "rd_no")
    private int rdNo;

    @Column(name = "trf_catg")
    private int trfCatg;

    @Column(name = "load1")
    private int load1;

    @Column(name = "load_unit_cd")
    private int loadUnitCd;

    @Column(name = "phase_cd")
    private int phaseCd;

    @Column(name = "first_cash_due_date")
    private Date firstCashDueDate;

    @Column(name = "rdg_typ_cd")
    private int rdgTypCd;

    @Column(name = "mtr_typ")
    private String mtrTyp;

    @Column(name = "mtr_no")
    private String mtrNo;

    @Column(name = "make")
    private String make;

    @Column(name = "mf")
    private int mf;

    @Column(name = "prev_rdg")
    private int prevRdg;

    @Column(name = "curr_rdg")
    private int currRdg;

    @Column(name = "ass_consmp")
    private int assConsmp;

    @Column(name = "mtr_consmp")
    private int mtrConsmp;

    @Column(name = "fca")
    private double fca;

    @Column(name = "energy_chrg")
    private double energyChrg;

    @Column(name = "mtr_rent")
    private int mtrRent;

    @Column(name = "prev_arr")
    private String prevArr;

    @Column(name = "adj_amt")
    private int adjAmt;

    @Column(name = "bill_net")
    private int billNet;

    @Column(name = "rdg_dt")
    private String rdgDt;

    @Column(name = "fixed_charge")
    private int fixedCharge;

    @Column(name = "curr_demand")
    private double currDemand;

    @Column(name = "area_name")
    private String areaName;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
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
    public String getLocDesc() {
        return locDesc;
    }

    @Override
    public void setLocDesc(String locDesc) {
        this.locDesc = locDesc;
    }

    @Override
    public String getConsName() {
        return consName;
    }

    @Override
    public void setConsName(String consName) {
        this.consName = consName;
    }

    @Override
    public String getAdd1() {
        return add1;
    }

    @Override
    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    @Override
    public String getAdd2() {
        return add2;
    }

    @Override
    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int getGrNo() {
        return grNo;
    }

    @Override
    public void setGrNo(int grNo) {
        this.grNo = grNo;
    }

    @Override
    public int getRdNo() {
        return rdNo;
    }

    @Override
    public void setRdNo(int rdNo) {
        this.rdNo = rdNo;
    }

    @Override
    public int getTrfCatg() {
        return trfCatg;
    }

    @Override
    public void setTrfCatg(int trfCatg) {
        this.trfCatg = trfCatg;
    }

    @Override
    public int getLoad1() {
        return load1;
    }

    @Override
    public void setLoad1(int load1) {
        this.load1 = load1;
    }

    @Override
    public int getLoadUnitCd() {
        return loadUnitCd;
    }

    @Override
    public void setLoadUnitCd(int loadUnitCd) {
        this.loadUnitCd = loadUnitCd;
    }

    @Override
    public int getPhaseCd() {
        return phaseCd;
    }

    @Override
    public void setPhaseCd(int phaseCd) {
        this.phaseCd = phaseCd;
    }

    @Override
    public Date getFirstCashDueDate() {
        return firstCashDueDate;
    }

    @Override
    public void setFirstCashDueDate(Date firstCashDueDate) {
        this.firstCashDueDate = firstCashDueDate;
    }

    @Override
    public int getRdgTypCd() {
        return rdgTypCd;
    }

    @Override
    public void setRdgTypCd(int rdgTypCd) {
        this.rdgTypCd = rdgTypCd;
    }

    @Override
    public String getMtrTyp() {
        return mtrTyp;
    }

    @Override
    public void setMtrTyp(String mtrTyp) {
        this.mtrTyp = mtrTyp;
    }

    @Override
    public String getMtrNo() {
        return mtrNo;
    }

    @Override
    public void setMtrNo(String mtrNo) {
        this.mtrNo = mtrNo;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public int getMf() {
        return mf;
    }

    @Override
    public void setMf(int mf) {
        this.mf = mf;
    }

    @Override
    public int getPrevRdg() {
        return prevRdg;
    }

    @Override
    public void setPrevRdg(int prevRdg) {
        this.prevRdg = prevRdg;
    }

    @Override
    public int getCurrRdg() {
        return currRdg;
    }

    @Override
    public void setCurrRdg(int currRdg) {
        this.currRdg = currRdg;
    }

    @Override
    public int getAssConsmp() {
        return assConsmp;
    }

    @Override
    public void setAssConsmp(int assConsmp) {
        this.assConsmp = assConsmp;
    }

    @Override
    public int getMtrConsmp() {
        return mtrConsmp;
    }

    @Override
    public void setMtrConsmp(int mtrConsmp) {
        this.mtrConsmp = mtrConsmp;
    }

    @Override
    public double getFca() {
        return fca;
    }

    @Override
    public void setFca(double fca) {
        this.fca = fca;
    }

    @Override
    public double getEnergyChrg() {
        return energyChrg;
    }

    @Override
    public void setEnergyChrg(double energyChrg) {
        this.energyChrg = energyChrg;
    }

    @Override
    public int getMtrRent() {
        return mtrRent;
    }

    @Override
    public void setMtrRent(int mtrRent) {
        this.mtrRent = mtrRent;
    }

    @Override
    public String getPrevArr() {
        return prevArr;
    }

    public void setPrevArr(String prevArr) {
        this.prevArr = prevArr;
    }

    @Override
    public int getAdjAmt() {
        return adjAmt;
    }

    @Override
    public void setAdjAmt(int adjAmt) {
        this.adjAmt = adjAmt;
    }

    @Override
    public int getBillNet() {
        return billNet;
    }

    @Override
    public void setBillNet(int billNet) {
        this.billNet = billNet;
    }

    @Override
    public String getRdgDt() {
        return rdgDt;
    }

    @Override
    public void setRdgDt(String rdgDt) {
        this.rdgDt = rdgDt;
    }

    @Override
    public int getFixedCharge() {
        return fixedCharge;
    }

    @Override
    public void setFixedCharge(int fixedCharge) {
        this.fixedCharge = fixedCharge;
    }

    @Override
    public double getCurrDemand() {
        return currDemand;
    }

    @Override
    public void setCurrDemand(double currDemand) {
        this.currDemand = currDemand;
    }

    @Override
    public String getAreaName() {
        return areaName;
    }

    @Override
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Override
    public String toString() {
        return "Rmon{" +
                "id=" + id +
                ", billMon=" + billMon +
                ", locCd=" + locCd +
                ", consNo=" + consNo +
                ", locDesc='" + locDesc + '\'' +
                ", consName='" + consName + '\'' +
                ", add1='" + add1 + '\'' +
                ", add2='" + add2 + '\'' +
                ", city='" + city + '\'' +
                ", grNo=" + grNo +
                ", rdNo=" + rdNo +
                ", trfCatg=" + trfCatg +
                ", load1=" + load1 +
                ", loadUnitCd=" + loadUnitCd +
                ", phaseCd=" + phaseCd +
                ", firstCashDueDate=" + firstCashDueDate +
                ", rdgTypCd=" + rdgTypCd +
                ", mtrTyp='" + mtrTyp + '\'' +
                ", mtrNo='" + mtrNo + '\'' +
                ", make='" + make + '\'' +
                ", mf=" + mf +
                ", prevRdg=" + prevRdg +
                ", currRdg=" + currRdg +
                ", assConsmp=" + assConsmp +
                ", mtrConsmp=" + mtrConsmp +
                ", fca=" + fca +
                ", energyChrg=" + energyChrg +
                ", mtrRent=" + mtrRent +
                ", prevArr='" + prevArr + '\'' +
                ", adjAmt=" + adjAmt +
                ", billNet=" + billNet +
                ", rdgDt='" + rdgDt + '\'' +
                ", fixedCharge=" + fixedCharge +
                ", currDemand=" + currDemand +
                ", areaName='" + areaName + '\'' +
                '}';
    }
}

