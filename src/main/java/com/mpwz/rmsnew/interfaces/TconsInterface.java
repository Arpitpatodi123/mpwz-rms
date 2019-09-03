package com.mpwz.rmsnew.interfaces;

import java.util.Date;

public interface TconsInterface extends  BeanInterface {

    public long getId();

    public void setId(long id);

    public int getConsNo() ;

    public void setConsNo(int consNo) ;

    public int getLocCd() ;

    public void setLocCd(int locCd) ;

    public Date getConnDate();

    public void setConnDate(Date connDate);

    public int getConsStaCd();

    public void setConsStaCd(int consStaCd);


}

