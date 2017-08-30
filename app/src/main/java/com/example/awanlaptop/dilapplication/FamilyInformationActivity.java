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

public class FamilyInformationActivity extends AppCompatActivity {
    TextView q1;
    TextView q2;
    TextView q3;

    EditText ans1;
    EditText ans2;
    EditText ans3;
   EditText numberofquestions;
    EditText sectionnameanswer;
    public static String value;
    public static int finalValue;
    MyDBHandler dbHandler;
    FamilyInformationActivity obj;
    FamilyInformationActivity2 obj2 = new FamilyInformationActivity2();
    FamilyInformationActivity3 obj3= new FamilyInformationActivity3();
    FamilyInformationActivity4 obj4=new FamilyInformationActivity4();
    FamilyInformationActivity5 obj5 = new FamilyInformationActivity5();
    FamilyInformationActivity6 obj6= new FamilyInformationActivity6();
    FamilyInformationActivity7 obj7= new FamilyInformationActivity7();
    FamilyInformationActivity8 obj8= new FamilyInformationActivity8();
    FamilyInformationActivity9 obj9= new FamilyInformationActivity9();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_information);
        q1=(TextView)findViewById(R.id.q1);
        q2=(TextView)findViewById(R.id.q2);
        q3=(TextView)findViewById(R.id.q3);

        ans1=(EditText) findViewById(R.id.ans1);
        ans2=(EditText) findViewById(R.id.ans2);
        ans3=(EditText) findViewById(R.id.ans3);
        numberofquestions=(EditText)findViewById(R.id.numberofquestions);
        sectionnameanswer=(EditText) findViewById(R.id.sectionnameanswer);


        dbHandler = new MyDBHandler(this, null, null, 1);


    }
    public void OnClickedBackButton(View view){
        Intent intent=new Intent(this,MainMenu.class);
        startActivity(intent);
    }
    public void onClickedNextButton(View view){
        FamilyInformationClass questions=new FamilyInformationClass();

        questions.setSection(sectionnameanswer.getText().toString());
        questions.setQuestion1(q1.getText().toString());

        questions.setQuestion2(q2.getText().toString());


        questions.setQuestion3(q3.getText().toString());



       String num= numberofquestions.getText().toString();
         finalValue=Integer.parseInt(num);

        value= sectionnameanswer.getText().toString();
        obj2.getvalue2(value);
        obj2.getnumberofquestions(finalValue);

        obj3.getvalue2(value);
        obj3.getnumberofquestions(finalValue);

        obj4.getvalue2(value);
        obj4.getnumberofquestions(finalValue);

        obj5.getvalue2(value);
        obj5.getnumberofquestions(finalValue);

        obj6.getvalue2(value);
        obj6.getnumberofquestions(finalValue);

        obj7.getvalue2(value);
        obj7.getnumberofquestions(finalValue);

        obj8.getvalue2(value);
        obj8.getnumberofquestions(finalValue);

        obj9.getvalue2(value);
        obj9.getnumberofquestions(finalValue);





        FamilyInformationClass answers=new FamilyInformationClass(ans1.getText().toString(),ans2.getText().toString(),ans3.getText().toString());

        dbHandler.insertFamilyInformationQuestions(questions,answers,finalValue);




        Intent intent=new Intent(this,FamilyInformationActivity2.class);
        startActivity(intent);
    }

}
