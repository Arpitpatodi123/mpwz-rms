package com.mpwz.rmsnew.interfaces;

public interface TPaymentsInterface extends BeanInterface
{
    public long getId() ;

    public void setId(long id) ;

    public String getLocCd() ;

    public void setLocCd(String locCd) ;

    public String getConsNo() ;

    public void setConsNo(String consNo) ;

    public String getPymtDate() ;

    public void setPymtDate(String pymtDate) ;

    public String gettWindow() ;

    public void settWindow(String tWindow);

    public String getSrNum() ;

    public void setSrNum(String srNum) ;

    public String getPymtAmt() ;

    public void setPymtAmt(String pymtAmt);
}
