package com.mpwz.rmsnew.interfaces;

import com.mpwz.rmsnew.beans.rms.Rmon;
import com.mpwz.rmsnew.beans.rms.TCons;
import com.mpwz.rmsnew.beans.rms.TConsS;
import com.mpwz.rmsnew.beans.rms.Tmon;
import com.mpwz.rmsnew.beans.sybase.TBillLT;
import com.mpwz.rmsnew.beans.sybase.TConsSybase;
import com.mpwz.rmsnew.beans.sybase.TMeterDetails;
import com.mpwz.rmsnew.beans.sybase.TPayments;

import java.util.List;

public interface CustomInterface extends BeanInterface
{

    //RMS
    public List<Tmon> getTmons() ;

    public void setTmons(List<Tmon> tmons);

    public List<TCons> gettCons();

    public void settCons(List<TCons> tCons);

    public List<TConsS> gettConsS();

    public void settConsS(List<TConsS> tConsS);

    public List<Rmon> getRmon();

    public void setRmon(List<Rmon> rmon) ;

    //SYBASE

    public List<TBillLT> gettBillLT() ;

    public void settBillLT(List<TBillLT> tBillLT) ;

    public List<TConsSybase> gettConsSybase();

    public void settConsSybase(List<TConsSybase> tConsSybase);

    public List<TMeterDetails> gettMeterDetails();

    public void settMeterDetails(List<TMeterDetails> tMeterDetails) ;

    public List<TPayments> gettPayments() ;

    public void settPayments(List<TPayments> tPayments) ;
}
