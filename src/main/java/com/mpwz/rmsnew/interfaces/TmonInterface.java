package com.mpwz.rmsnew.interfaces;

import java.util.Date;

public interface TmonInterface extends BeanInterface {

    public long getId() ;

    public void setId(long id);

    public int getLocCd() ;

    public void setLocCd(int locCd) ;

    public int getConsNo() ;

    public void setConsNo(int consNo) ;

    public String getDuty() ;

    public void setDuty(String duty) ;

    public int getSdHeld() ;

    public void setSdHeld(int sdHeld) ;

    public Date getBillMon() ;

    public void setBillMon(Date billMon);

    public int getTotAmtPaid() ;

    public void setTotAmtPaid(int totAmtPaid) ;

    public int getDemandId() ;

    public void setDemandId(int demandId);

    public String getLastPymtRectNo() ;

    public void setLastPymtRectNo(String lastPymtRectNo) ;
}

