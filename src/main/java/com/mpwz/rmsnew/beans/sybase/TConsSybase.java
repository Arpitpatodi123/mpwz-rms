package com.mpwz.rmsnew.beans.sybase;

import com.mpwz.rmsnew.interfaces.TConsSybaseInterface;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "TConsSybase")
@Table(name = "t_cons",schema = "sybase")
public class TConsSybase implements TConsSybaseInterface
{
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "loc_cd")
    private String locCd;

    @Column(name = "cons_num")
    private String consNo;

    @Column(name = " group_num")
    private String  groupNum;

    @Column(name = "reader_num")
    private String readerNum;

    @Column(name = "cons_name")
    private String consName;

    @Column(name = "cons_addr1")
    private String consAddr1;

    @Column(name = "cons_addr2")
    private String consAddr2;

    @Column(name = "cons_addr3")
    private String consAddr3;

    @Column(name = "trf_catg")
    private String trfCatg;

    @Column(name = "meter_rent_cd")
    private String meterRentCd;

    @Column(name = "duty_cd")
    private String dutyCd;

    @Column(name = "conn_load")
    private String connLoad;

    @Column(name = " load_unit")
    private String  loadUnit;

    @Column(name = "area_type")
    private String areaType;

    @Column(name = "perm_temp")
    private String permTemp;

    @Column(name = "cons_sta")
    private String consSta;

    @Column(name = "catgry")
    private String catgry;

    @Column(name = "curr_rdg_date")
    private String currRdgDate;

    @Column(name = "curr_rdg_typ")
    private String currRdgTyp;

    @Column(name = "phone")
    private String phone;

    @Column(name = "mobile")
    private String mobile;

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

    public String getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
    }

    public String getReaderNum() {
        return readerNum;
    }

    public void setReaderNum(String readerNum) {
        this.readerNum = readerNum;
    }

    public String getConsName() {
        return consName;
    }

    public void setConsName(String consName) {
        this.consName = consName;
    }

    public String getConsAddr1() {
        return consAddr1;
    }

    public void setConsAddr1(String consAddr1) {
        this.consAddr1 = consAddr1;
    }

    public String getConsAddr2() {
        return consAddr2;
    }

    public void setConsAddr2(String consAddr2) {
        this.consAddr2 = consAddr2;
    }

    public String getConsAddr3() {
        return consAddr3;
    }

    public void setConsAddr3(String consAddr3) {
        this.consAddr3 = consAddr3;
    }

    public String getTrfCatg() {
        return trfCatg;
    }

    public void setTrfCatg(String trfCatg) {
        this.trfCatg = trfCatg;
    }

    public String getMeterRentCd() {
        return meterRentCd;
    }

    public void setMeterRentCd(String meterRentCd) {
        this.meterRentCd = meterRentCd;
    }

    public String getDutyCd() {
        return dutyCd;
    }

    public void setDutyCd(String dutyCd) {
        this.dutyCd = dutyCd;
    }

    public String getConnLoad() {
        return connLoad;
    }

    public void setConnLoad(String connLoad) {
        this.connLoad = connLoad;
    }

    public String getLoadUnit() {
        return loadUnit;
    }

    public void setLoadUnit(String loadUnit) {
        this.loadUnit = loadUnit;
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    public String getPermTemp() {
        return permTemp;
    }

    public void setPermTemp(String permTemp) {
        this.permTemp = permTemp;
    }

    public String getConsSta() {
        return consSta;
    }

    public void setConsSta(String consSta) {
        this.consSta = consSta;
    }

    public String getCatgry() {
        return catgry;
    }

    public void setCatgry(String catgry) {
        this.catgry = catgry;
    }

    public String getCurrRdgDate() {
        return currRdgDate;
    }

    public void setCurrRdgDate(String currRdgDate) {
        this.currRdgDate = currRdgDate;
    }

    public String getCurrRdgTyp() {
        return currRdgTyp;
    }

    public void setCurrRdgTyp(String currRdgTyp) {
        this.currRdgTyp = currRdgTyp;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "TConsSybase{" +
                "id=" + id +
                ", locCd='" + locCd + '\'' +
                ", consNo='" + consNo + '\'' +
                ", groupNum='" + groupNum + '\'' +
                ", readerNum='" + readerNum + '\'' +
                ", consName='" + consName + '\'' +
                ", consAddr1='" + consAddr1 + '\'' +
                ", consAddr2='" + consAddr2 + '\'' +
                ", consAddr3='" + consAddr3 + '\'' +
                ", trfCatg='" + trfCatg + '\'' +
                ", meterRentCd='" + meterRentCd + '\'' +
                ", dutyCd='" + dutyCd + '\'' +
                ", connLoad='" + connLoad + '\'' +
                ", loadUnit='" + loadUnit + '\'' +
                ", areaType='" + areaType + '\'' +
                ", permTemp='" + permTemp + '\'' +
                ", consSta='" + consSta + '\'' +
                ", catgry='" + catgry + '\'' +
                ", currRdgDate='" + currRdgDate + '\'' +
                ", currRdgTyp='" + currRdgTyp + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
