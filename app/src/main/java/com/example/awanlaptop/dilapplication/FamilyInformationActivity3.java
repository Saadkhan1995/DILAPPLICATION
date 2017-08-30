package com.example.awanlaptop.dilapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FamilyInformationActivity3 extends AppCompatActivity {
    TextView q7;
    EditText ans7a;
    EditText ans7b;
    EditText ans7c;

    public static String sectionName;
    public static int num;
    MyDBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_information3);

        q7 = (TextView) findViewById(R.id.q7);

        ans7a = (EditText) findViewById(R.id.ans7a);
        ans7b = (EditText) findViewById(R.id.ans7b);
        ans7c = (EditText) findViewById(R.id.ans7c);

        dbHandler = new MyDBHandler(this, null, null, 1);
    }

    public void onClickedNextButton(View view){
        FamilyInformationClass questions=new FamilyInformationClass();
        FamilyInformationClass answers=new FamilyInformationClass();



        questions.setQuestion7(q7.getText().toString());
        answers.setAnswer7(ans7a.getText().toString(),ans7b.getText().toString(),ans7c.getText().toString());


        dbHandler.insertFamilyInformationQuestions3(questions,answers,getfinalValue(),getSectionName());




        Intent intent=new Intent(this,FamilyInformationActivity4.class);
        startActivity(intent);
    }
    public void OnClickedBackButton(View view){
        Intent intent=new Intent(this,FamilyInformationActivity2.class);
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
