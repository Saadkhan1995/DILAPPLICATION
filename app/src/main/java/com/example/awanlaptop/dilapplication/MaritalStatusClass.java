package com.example.awanlaptop.dilapplication;

import android.util.Log;

/**
 * Created by awan laptop on 8/7/2017.
 */

public class MaritalStatusClass {

    private String question1;
    private String question2;
    private String question3;
    private String question4;
    private String question5;


    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String answer5;
    private String Section;

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }
    public String getAnswer5() {
        return answer5;
    }


    public MaritalStatusClass() {

    }
    public MaritalStatusClass(String answer1) {
        this.answer1 = answer1;
    }
    public MaritalStatusClass(String answer2,String a) {
        this.answer2 = answer2;
    }
    public MaritalStatusClass(String answer3,String a, String b) {
        this.answer3 = answer3;
    }
    public MaritalStatusClass(String answer4,String a, String b, String c) {
        this.answer4 = answer4;
    }
    public MaritalStatusClass(String answer5 ,String a, String b, String c, String d) {
        this.answer5 = answer5;

    }


    public void setQuestion1(String question1)
    {
        this.question1=question1;
    }
    public String getQuestion1()
    {
        return question1;
    }
    public void setQuestion2(String question2)
    {
        this.question2= question2;
    }

    public String getQuestion2()
    {
        return question2;
    }
    public void setQuestion3(String question3)
    {
        this.question3=question3;
    }
    public String getQuestion3()
    {
        return question3;
    }
    public void setQuestion4(String question4)
    {
        this.question4=question4;
    }
    public String getQuestion4()
    {
        return question4;
    }
    public void setQuestion5(String question5)
    {
        this.question5=question5;
    }

    public String getQuestion5()
    {
        return question5;
    }


     public String getSection() {

        return Section;

    }

    public void setSection(String section) {
        Section = section;
    }
}
