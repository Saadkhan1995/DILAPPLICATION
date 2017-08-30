package com.example.awanlaptop.dilapplication;

import android.util.Log;
import android.widget.Toast;

/**
 * Created by awan laptop on 8/1/2017.
 */

public class Respondentclass {
    private String ustudentName;
    private String ucontactNum;
    private String uschoolName;
    private String uemailAdd;
    private String udateofBirth;
    private String ustudentGender;
    private String umotherTongue;
    private String umaritalStatus;
    private String uhomeAddress;
    private String sectionname;


    public Respondentclass(String ustudentName, String ucontactNum, String uschoolName, String uemailAdd) {
        this.ustudentName = ustudentName;
        this.ucontactNum = ucontactNum;
        this.uschoolName = uschoolName;
        this.uemailAdd = uemailAdd;
    }
    public Respondentclass(String udateofBirth,String umotherTongue)
    {
        this.udateofBirth=udateofBirth;
        this.umotherTongue=umotherTongue;
    }
    public Respondentclass(String ustudentGender)
    {
        this.ustudentGender=ustudentGender;

    }

    public Respondentclass(String umaritalStatus,String a,String b,String c,String d)
    {
        this.umaritalStatus=umaritalStatus;
    }
    public Respondentclass(String uhomeAddress,String sectionname,String b)
    {
        this.uhomeAddress=uhomeAddress;
        this.sectionname=sectionname;

    }

    public String getUstudentName() {
        return ustudentName;
    }

    public void setUstudentName(String ustudentName) {
        this.ustudentName = ustudentName;
    }

    public String getUcontactNum() {
        return ucontactNum;
    }

    public void setUcontactNum(String ucontactNum) {
        this.ucontactNum = ucontactNum;
    }

    public String getUschoolName() {
        return uschoolName;
    }

    public void setUschoolName(String uschoolName) {
        this.uschoolName = uschoolName;
    }

    public String getUemailAdd() {
        return uemailAdd;
    }

    public void setUemailAdd(String uemailAdd) {
        this.uemailAdd = uemailAdd;
    }

    public String getUdateofBirth() {
        return udateofBirth;
    }

    public void setUdateofBirth(String udateofBirth) {
        this.udateofBirth = udateofBirth;
    }

    public String getUstudentGender() {
        return ustudentGender;
    }

    public void setUstudentGender(String ustudentGender) {
        this.ustudentGender = ustudentGender;
    }

    public String getUmotherTongue() {
        return umotherTongue;
    }

    public void setUmotherTongue(String umotherTongue) {
        this.umotherTongue = umotherTongue;
    }

    public String getUmaritalStatus() {
        return umaritalStatus;
    }

    public void setUmaritalStatus(String umaritalStatus) {
        this.umaritalStatus = umaritalStatus;
    }

    public String getUhomeAddress() {
        return uhomeAddress;
    }

    public void setUhomeAddress(String uhomeAddress) {
        this.uhomeAddress = uhomeAddress;
    }

    public String getSectionname() {
        return sectionname;
    }
}
