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

public class FamilyInformationActivity6 extends AppCompatActivity {

    TextView q10;
    TextView q11;
    TextView q12;
    TextView q13;

    RadioButton ans10Yes;
    RadioButton ans10No;
    RadioButton ans13Yes;
    RadioButton ans13No;

    EditText ans11;
    EditText ans12;

    public static String sectionName;
    public static int num;
    MyDBHandler dbHandler;
    FamilyInformationClass obj2=new FamilyInformationClass();
    FamilyInformationClass obj3=new FamilyInformationClass();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_information6);

        q10=(TextView)findViewById(R.id.q10);
        q11=(TextView)findViewById(R.id.q11);
        q12=(TextView)findViewById(R.id.q12);
        q13=(TextView)findViewById(R.id.q13);


        ans11=(EditText) findViewById(R.id.ans11);
        ans12=(EditText) findViewById(R.id.ans12);

        ans10Yes=(RadioButton) findViewById(R.id.ans10Yes);
        ans10No=(RadioButton) findViewById(R.id.ans10No);
        ans13Yes=(RadioButton) findViewById(R.id.ans13Yes);
        ans13No=(RadioButton) findViewById(R.id.ans13No);

        dbHandler = new MyDBHandler(this, null, null, 1);


    }
public void onClickedNextButton(View view){

    FamilyInformationClass questions=new FamilyInformationClass();

    questions.setQuestion10(q10.getText().toString());
    questions.setQuestion11(q11.getText().toString());
    questions.setQuestion12(q12.getText().toString());
    questions.setQuestion13(q13.getText().toString());


    FamilyInformationClass answers=new FamilyInformationClass();
    answers.setAnswer11(ans11.getText().toString());
    answers.setAnswer12(ans12.getText().toString());



    dbHandler.insertFamilyInformationQuestions6(questions,answers,getfinalValue(),getSectionName(),obj2,obj3);






    Intent intent=new Intent(this,FamilyInformationActivity7.class);
    startActivity(intent);
}


public void onClickedBackButton(View view){
    Intent intent=new Intent(this,FamilyInformationActivity5.class);
    startActivity(intent);
}




    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans10Yes:
                if (checked) {
                    String answer = "Yes";


                    obj2.setAnswer10(answer);



                }
                break;
            case R.id.ans10No:
                if (checked) {
                    String answer = "No";


                    obj2.setAnswer10(answer);




                }
                break;
            case R.id.ans13Yes:
                if (checked) {
                    String answer = "Yes";


                    obj3.setAnswer13(answer);




                }
                break;
            case R.id.ans13No:
                if (checked) {
                    String answer = "No";


                    obj3.setAnswer13(answer);




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
