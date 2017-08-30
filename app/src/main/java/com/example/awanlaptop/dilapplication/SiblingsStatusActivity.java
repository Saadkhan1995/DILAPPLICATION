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

public class SiblingsStatusActivity extends AppCompatActivity {
    TextView q1;
    TextView q2;

    EditText ans1a;
    EditText ans1b;
    EditText ans2a;
    EditText ans2b;

    EditText numberofquestions;
    EditText sectionnameanswer;


    public static String sectionName;
    public static int num;


    public static String value;
    public static int finalValue;

    MyDBHandler dbHandler;
    SiblingsStatus2Activity obj2 = new SiblingsStatus2Activity();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siblings_status);
        q1=(TextView)findViewById(R.id.q1);
        q2=(TextView)findViewById(R.id.q2);
        ans1a=(EditText) findViewById(R.id.ans1a);
        ans1b=(EditText) findViewById(R.id.ans1b);
        ans2a=(EditText) findViewById(R.id.ans2a);
        ans2b=(EditText) findViewById(R.id.ans2b);
        numberofquestions=(EditText)findViewById(R.id.numberofquestions);
        sectionnameanswer=(EditText) findViewById(R.id.sectionnameanswer);
        dbHandler = new MyDBHandler(this, null, null, 1);




    }
    public void onClickedNextButton(View view) {

        SiblingsStatusClass questions=new SiblingsStatusClass();
        questions.setSection(sectionnameanswer.getText().toString());
        questions.setQuestion1(q1.getText().toString());

        questions.setQuestion2(q2.getText().toString());


        String num= numberofquestions.getText().toString();
        finalValue=Integer.parseInt(num);

        value= sectionnameanswer.getText().toString();
        obj2.getvalue2(value);
        obj2.getnumberofquestions(finalValue);

        SiblingsStatusClass answers=new SiblingsStatusClass();
        answers.setAnswer1a(ans1a.getText().toString());
        answers.setAnswer1b(ans1b.getText().toString());

        answers.setAnswer2a(ans2a.getText().toString());
        answers.setAnswer2b(ans2b.getText().toString());


        dbHandler.insertSiblingStatusActivityQuestion1(questions,answers,finalValue);



        Intent intent = new Intent(this,SiblingsStatus2Activity.class);
        startActivity(intent);
    }

    public void onClickedBackButton(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }


}
