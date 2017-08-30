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

public class SuggestionActivity2 extends AppCompatActivity {

    TextView q2;
    EditText ans2a;
    EditText ans2b;
    EditText ans2c;
    public static String sectionName;
    public static int num;
    MyDBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion2);

        q2 = (TextView) findViewById(R.id.q2);
        ans2a = (EditText) findViewById(R.id.ans2a);
        ans2b = (EditText) findViewById(R.id.ans2b);
        ans2c = (EditText) findViewById(R.id.ans2c);

        dbHandler = new MyDBHandler(this, null, null, 1);


    }
    public void onClickedNextButton(View view) {



        SuggestionClass questions=new SuggestionClass();
        questions.setQuestion2(q2.getText().toString());


        SuggestionClass answers=new SuggestionClass();
        answers.setAnswer2a(ans2a.getText().toString());
        answers.setAnswer2b(ans2b.getText().toString());
        answers.setAnswer2c(ans2c.getText().toString());

        dbHandler.insertSuggestionActivityQuestion2(questions,answers,getfinalValue(),getSectionName());
        Intent intent = new Intent(this, FeedbackActivity.class);
        startActivity(intent);
    }

    public void onClickedBackButton(View view) {
        Intent intent = new Intent(this, SuggestionActivity.class);
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


