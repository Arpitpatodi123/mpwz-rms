package com.mpwz.rmsnew.interfaces;

import java.util.Date;

public interface RmonInterface extends BeanInterface {

    public long getId();

    public void setId(long id);

    public Date getBillMon();

    public void setBillMon(Date billMon);

    public int getLocCd();

    public void setLocCd(int locCd);

    public int getConsNo();

    public void setConsNo(int consNo);

    public String getLocDesc();

    public void setLocDesc(String locDesc);

    public String getConsName();

    public void setConsName(String consName);

    public String getAdd1();

    public void setAdd1(String add1);

    public String getAdd2();

    public void setAdd2(String add2);

    public String getCity();

    public void setCity(String city);

    public int getGrNo();

    public void setGrNo(int grNo);

    public int getRdNo();

    public void setRdNo(int rdNo);

    public int getTrfCatg();

    public void setTrfCatg(int trfCatg);

    public int getLoad1();

    public void setLoad1(int load1);

    public int getLoadUnitCd();

    public void setLoadUnitCd(int loadUnitCd);

    public int getPhaseCd();

    public void setPhaseCd(int phaseCd);

    public Date getFirstCashDueDate();

    public void setFirstCashDueDate(Date firstCashDueDate);

    public int getRdgTypCd();

    public void setRdgTypCd(int rdgTypCd);

    public String getMtrTyp();

    public void setMtrTyp(String mtrTyp);

    public String getMtrNo();

    public void setMtrNo(String mtrNo);

    public String getMake();

    public void setMake(String make);

    public int getMf();

    public void setMf(int mf);

    public int getPrevRdg();

    public void setPrevRdg(int prevRdg);

    public int getCurrRdg();

    public void setCurrRdg(int currRdg);

    public int getAssConsmp();

    public void setAssConsmp(int assConsmp);

    public int getMtrConsmp();

    public void setMtrConsmp(int mtrConsmp);

    public double getFca();

    public void setFca(double fca);

    public double getEnergyChrg();

    public void setEnergyChrg(double energyChrg);

    public int getMtrRent();

    public void setMtrRent(int mtrRent);

    public String getPrevArr();

    public void setPrevArr(String prevArr) ;

    public int getAdjAmt();

    public void setAdjAmt(int adjAmt);

    public int getBillNet();

    public void setBillNet(int billNet);

    public String getRdgDt();

    public void setRdgDt(String rdgDt);

    public int getFixedCharge();

    public void setFixedCharge(int fixedCharge);

    public double getCurrDemand();

    public void setCurrDemand(double currDemand);

    public String getAreaName();

    public void setAreaName(String areaName);


}

