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

public class FamilyInformationActivity9 extends AppCompatActivity {
    TextView q22;
    TextView q23;

    EditText ans22;
    EditText ans23;
    public static String sectionName;
    public static int num;
    MyDBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_information9);
        q22=(TextView)findViewById(R.id.q22);
        q23=(TextView)findViewById(R.id.q23);

        ans22=(EditText) findViewById(R.id.ans22);
        ans23=(EditText) findViewById(R.id.ans23);

        dbHandler = new MyDBHandler(this, null, null, 1);


    }
    public void onClickedNextButton(View view){

        FamilyInformationClass questions=new FamilyInformationClass();

        questions.setQuestion22(q22.getText().toString());
        questions.setQuestion23(q23.getText().toString());



        FamilyInformationClass answers=new FamilyInformationClass();
        answers.setAnswer22(ans22.getText().toString());
        answers.setAnswer23(ans23.getText().toString());




        dbHandler.insertFamilyInformationQuestions9(questions,answers,getfinalValue(),getSectionName());


        Intent intent=new Intent(this,MainMenu.class);
        startActivity(intent);
    }
    public void onClickedBackButton(View view){
        Intent intent=new Intent(this,FamilyInformationActivity8.class);
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
