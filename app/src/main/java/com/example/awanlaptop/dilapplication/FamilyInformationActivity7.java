package com.example.awanlaptop.dilapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class FamilyInformationActivity7 extends AppCompatActivity {
    TextView q14;
    TextView q15;
    TextView q16;
    TextView q17;

    RadioButton ans16Yes;
    RadioButton ans16No;
    EditText ans14;
    EditText ans15;
    EditText ans17;

    public static String sectionName;
    public static int num;
    MyDBHandler dbHandler;
    FamilyInformationClass obj2=new FamilyInformationClass();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_information7);
        q14=(TextView)findViewById(R.id.q14);
        q15=(TextView)findViewById(R.id.q15);
        q16=(TextView)findViewById(R.id.q16);
        q17=(TextView)findViewById(R.id.q17);

        ans14=(EditText) findViewById(R.id.ans14);
        ans15=(EditText) findViewById(R.id.ans15);
        ans16Yes=(RadioButton) findViewById(R.id.ans16Yes);
        ans16No=(RadioButton) findViewById(R.id.ans16No);
        ans17=(EditText) findViewById(R.id.ans17);




        dbHandler = new MyDBHandler(this, null, null, 1);

    }
public void onClickedNextButton(View view){

    FamilyInformationClass questions=new FamilyInformationClass();

    questions.setQuestion14(q14.getText().toString());
    questions.setQuestion15(q15.getText().toString());
    questions.setQuestion16(q16.getText().toString());
    questions.setQuestion17(q17.getText().toString());


    FamilyInformationClass answers=new FamilyInformationClass();
    answers.setAnswer14(ans14.getText().toString());
    answers.setAnswer15(ans15.getText().toString());
    answers.setAnswer17(ans17.getText().toString());



    dbHandler.insertFamilyInformationQuestions7(questions,answers,getfinalValue(),getSectionName(),obj2);



    Intent intent=new Intent(this,FamilyInformationActivity8.class);
    startActivity(intent);
}
    public void onClickedBackButton(View view){
        Intent intent=new Intent(this,FamilyInformationActivity6.class);
        startActivity(intent);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans16Yes:
                if (checked) {
                    String answer = "Yes";


                    obj2.setAnswer16(answer);


                }
                break;
            case R.id.ans16No:
                if (checked) {
                    String answer = "No";


                    obj2.setAnswer16(answer);


                }
                break;
        }
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
