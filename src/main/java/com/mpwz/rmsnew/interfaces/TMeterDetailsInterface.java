package com.mpwz.rmsnew.interfaces;

public interface TMeterDetailsInterface extends BeanInterface
{
    public long getId() ;

    public void setId(long id);

    public String getLocCd() ;

    public void setLocCd(String locCd);

    public String getConsNo() ;

    public void setConsNo(String consNo) ;

    public String getMeterType() ;

    public void setMeterType(String meterType) ;

    public String getMeterNum() ;

    public void setMeterNum(String meterNum);

    public String getMake() ;

    public void setMake(String make) ;

    public String getMultFactor();

    public void setMultFactor(String multFactor);

    public String getInstDate() ;

    public void setInstDate(String instDate) ;

    public String getMeterPhases() ;

    public void setMeterPhases(String meterPhases) ;

    public String getMeterStatus();

    public void setMeterStatus(String meterStatus) ;
}
