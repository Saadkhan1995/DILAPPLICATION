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

public class SiblingsStatus2Activity extends AppCompatActivity {
    TextView q3;
    EditText ans3a;
    EditText ans3b;



    public static String sectionName;
    public static int num;
    MyDBHandler dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siblings_status2);

        q3 = (TextView) findViewById(R.id.q3);
        ans3a = (EditText) findViewById(R.id.ans3a);
        ans3b = (EditText) findViewById(R.id.ans3b);

        dbHandler = new MyDBHandler(this, null, null, 1);

    }
    public void onClickFinishButton(View view)
    {
        SiblingsStatusClass questions=new SiblingsStatusClass();
        questions.setQuestion3(q3.getText().toString());


        SiblingsStatusClass answers=new SiblingsStatusClass();
        answers.setAnswer3a(ans3a.getText().toString());
        answers.setAnswer3b(ans3b.getText().toString());

        dbHandler.insertSiblingStatusActivityQuestion2(questions,answers,getfinalValue(),getSectionName());




        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
    public void onClickedBackButton(View view) {
        Intent intent = new Intent(this, SiblingsStatusActivity.class);
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
