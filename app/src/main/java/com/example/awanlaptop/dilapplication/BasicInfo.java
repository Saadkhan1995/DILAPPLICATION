package com.example.awanlaptop.dilapplication;

/**
 * Created by awan laptop on 7/25/2017.
 */

public class BasicInfo {
    private String uname;
    private String ucontactnumber;
    private String udate;
    private String udesignation;
    private String ustart;
    private String uend;
    private String uvillage;
    private String uproject;

    public BasicInfo(String pn) {
        this.uproject = pn;

    }

    public BasicInfo(String uname, String ucontactnumber, String udate,
                     String udesignation, String ustart, String uend,
                     String uvillage) {
        this.uname = uname;
        this.ucontactnumber = ucontactnumber;
        this.udate = udate;
        this.udesignation = udesignation;
        this.ustart = ustart;
        this.uend = uend;
        this.uvillage = uvillage;
        //this.uproject = uproject;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUcontactnumber() {
        return ucontactnumber;
    }

    public void setUcontactnumber(String ucontactnumber) {
        this.ucontactnumber = ucontactnumber;
    }

    public String getUdate() {
        return udate;
    }

    public void setUdate(String udate) {
        this.udate = udate;
    }

    public String getUdesignation() {
        return udesignation;
    }

    public void setUdesignation(String udesignation) {
        this.udesignation = udesignation;
    }

    public String getUstart() {
        return ustart;
    }

    public void setUstart(String ustart) {
        this.ustart = ustart;
    }

    public String getUend() {
        return uend;
    }

    public void setUend(String uend) {
        this.uend = uend;
    }

    public String getUvillage() {
        return uvillage;
    }

    public void setUvillage(String uvillage) {
        this.uvillage = uvillage;
    }

    public String getUproject() {
        return uproject;
    }

    public void setUproject(String uproject) {
        this.uproject = uproject;
    }
}