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

public class SuggestionActivity extends AppCompatActivity {

    TextView q1;

    EditText ans1a;
    EditText ans1b;
    EditText ans1c;

    EditText numberofquestions;
    EditText sectionnameanswer;
    public static String sectionName;
    public static int num;


    public static String value;
    public static int finalValue;

    MyDBHandler dbHandler;
    SuggestionActivity2 obj2 = new SuggestionActivity2();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);

        q1=(TextView)findViewById(R.id.q1);
        ans1a=(EditText) findViewById(R.id.ans1a);
        ans1b=(EditText) findViewById(R.id.ans1b);
        ans1c=(EditText) findViewById(R.id.ans1c);
        numberofquestions=(EditText)findViewById(R.id.numberofquestions);
        sectionnameanswer=(EditText) findViewById(R.id.sectionnameanswer);
        dbHandler = new MyDBHandler(this, null, null, 1);
    }
    public void onClickedNextButton(View view) {

        SuggestionClass questions=new SuggestionClass();
        questions.setSection(sectionnameanswer.getText().toString());
        questions.setQuestion1(q1.getText().toString());

        String num= numberofquestions.getText().toString();
        finalValue=Integer.parseInt(num);
        value= sectionnameanswer.getText().toString();
        obj2.getvalue2(value);
        obj2.getnumberofquestions(finalValue);

        SuggestionClass answers=new SuggestionClass();
        answers.setAnswer1a(ans1a.getText().toString());
        answers.setAnswer1b(ans1b.getText().toString());

        answers.setAnswer1c(ans1c.getText().toString());

        dbHandler.insertSuggestionActivityQuestion1(questions,answers,finalValue);
        Intent intent = new Intent(this, SuggestionActivity2.class);
        startActivity(intent);
    }

    public void onClickedBackButton(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

}
