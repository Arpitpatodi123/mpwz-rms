package com.mpwz.rmsnew.beans;

import com.mpwz.rmsnew.beans.rms.Rmon;
import com.mpwz.rmsnew.beans.rms.TCons;
import com.mpwz.rmsnew.beans.rms.TConsS;
import com.mpwz.rmsnew.beans.rms.Tmon;
import com.mpwz.rmsnew.beans.sybase.TBillLT;
import com.mpwz.rmsnew.beans.sybase.TConsSybase;
import com.mpwz.rmsnew.beans.sybase.TMeterDetails;
import com.mpwz.rmsnew.beans.sybase.TPayments;
import com.mpwz.rmsnew.interfaces.CustomInterface;

import java.util.List;

public class Custom implements CustomInterface
{

    //RMS
    private List<Rmon> rmon;

    private List<Tmon> tmons;

    private List<TCons>tCons;

    private List<TConsS>tConsS;

    //SYBASE
    private List<TBillLT>tBillLT;

    private List<TConsSybase>tConsSybase;

    private List<TMeterDetails>tMeterDetails;

    private List<TPayments>tPayments;

    //RMS
    public List<Tmon> getTmons() { return tmons; }

    public void setTmons(List<Tmon> tmons) {
        this.tmons = tmons;
    }

    public List<TCons> gettCons() {
        return tCons;
    }

    public void settCons(List<TCons> tCons) {
        this.tCons = tCons;
    }

    public List<TConsS> gettConsS() {
        return tConsS;
    }

    public void settConsS(List<TConsS> tConsS) {
        this.tConsS = tConsS;
    }

    @Override
    public List<Rmon> getRmon() {
        return rmon;
    }

    public void setRmon(List<Rmon> rmon) {
        this.rmon = rmon;
    }

    //SYBASE
    public List<TBillLT> gettBillLT() {
        return tBillLT;
    }

    public void settBillLT(List<TBillLT> tBillLT) {
        this.tBillLT = tBillLT;
    }

    public List<TConsSybase> gettConsSybase() {
        return tConsSybase;
    }

    public void settConsSybase(List<TConsSybase> tConsSybase) {
        this.tConsSybase = tConsSybase;
    }

    public List<TMeterDetails> gettMeterDetails() {
        return tMeterDetails;
    }

    public void settMeterDetails(List<TMeterDetails> tMeterDetails) {
        this.tMeterDetails = tMeterDetails;
    }

    public List<TPayments> gettPayments() {
        return tPayments;
    }

    public void settPayments(List<TPayments> tPayments) {
        this.tPayments = tPayments;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "rmon=" + rmon +
                ", tmons=" + tmons +
                ", tCons=" + tCons +
                ", tConsS=" + tConsS +
                ", tBillLT=" + tBillLT +
                ", tConsSybase=" + tConsSybase +
                ", tMeterDetails=" + tMeterDetails +
                ", tPayments=" + tPayments +
                '}';
    }
}
