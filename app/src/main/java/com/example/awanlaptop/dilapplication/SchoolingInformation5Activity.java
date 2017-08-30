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

public class SchoolingInformation5Activity extends AppCompatActivity {
    TextView q4;
    TextView q5;
    RadioButton ans4Yes;
    RadioButton ans4No;
    EditText ans5;

    public static String sectionName;
    public static int num;
    MyDBHandler dbHandler;
    SchoolingInformationClass obj4=new SchoolingInformationClass();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schooling_information5);

        q4 = (TextView) findViewById(R.id.q4);
        q5= (TextView) findViewById(R.id.q5);
        ans4Yes=(RadioButton)findViewById(R.id.ans4Yes);
        ans4No=(RadioButton)findViewById(R.id.ans4No);
        ans5=(EditText) findViewById(R.id.ans5);

        dbHandler = new MyDBHandler(this, null, null, 1);

    }
    public void onClickedNextButton(View view){
        SchoolingInformationClass question=new SchoolingInformationClass();
        SchoolingInformationClass answer=new SchoolingInformationClass();
        question.setQuestion4(q4.getText().toString());
        question.setQuestion5(q5.getText().toString());
        answer.setAnswer5(ans5.getText().toString());

        dbHandler.insertSchoolingInformationQuestions5(question,answer,obj4,getfinalValue(),getSectionName());



        Intent intent=new Intent(this,SchoolingInformation6Activity.class);
        startActivity(intent);
    }
    public void onClickedBackButton(View view){
        Intent intent=new Intent(this,SchoolingInformation4Activity.class);
        startActivity(intent);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans4Yes:
                if (checked) {
                    String answer = "Yes";


                    obj4.setAnswer4(answer);


                }
                break;
            case R.id.ans4No:
                if (checked) {
                    String answer = "No";


                    obj4.setAnswer4(answer);


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
