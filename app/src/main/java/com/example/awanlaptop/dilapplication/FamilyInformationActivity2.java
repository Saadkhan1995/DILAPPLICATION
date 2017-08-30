package com.example.awanlaptop.dilapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FamilyInformationActivity2 extends AppCompatActivity {
    public static String sectionName;
    public static int num;

    TextView q4;
    TextView q5;
    TextView q6;

    EditText ans4;
    EditText ans5;
    EditText ans6;

    MyDBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_information2);

        q4=(TextView)findViewById(R.id.q4);
        q5=(TextView)findViewById(R.id.q5);
        q6=(TextView)findViewById(R.id.q6);

        ans4=(EditText) findViewById(R.id.ans4);
        ans5=(EditText) findViewById(R.id.ans5);
        ans6=(EditText) findViewById(R.id.ans6);

        dbHandler = new MyDBHandler(this, null, null, 1);

    }
    public void onClickedNextButton(View view){


        FamilyInformationClass questions=new FamilyInformationClass();


        questions.setQuestion4(q4.getText().toString());

        questions.setQuestion5(q5.getText().toString());


        questions.setQuestion6(q6.getText().toString());

        FamilyInformationClass answers=new FamilyInformationClass(ans4.getText().toString(),ans5.getText().toString(),ans6.getText().toString(),"b");

        dbHandler.insertFamilyInformationQuestions2(questions,answers,getfinalValue(),getSectionName());


        Intent intent = new Intent(this, FamilyInformationActivity3.class);
        startActivity(intent);
    }
    public void OnClickedBackButton(View view){
        Intent intent=new Intent(this,FamilyInformationActivity.class);
        startActivity(intent);
    }

    public  void getvalue2(String section)
    {

        this.sectionName=section;


    }
    public String getSectionName()
    {
        return sectionName;
    }

    public  void getnumberofquestions(int numb)
    {

        this.num=numb;


    }
    public int getfinalValue()
    {
        return num;
    }

}
