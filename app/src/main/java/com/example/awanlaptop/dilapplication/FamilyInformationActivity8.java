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

public class FamilyInformationActivity8 extends AppCompatActivity {
    TextView q18;
    TextView q19;
    TextView q20;
    TextView q21;

    EditText ans18;
    RadioButton ans19Yes;
    RadioButton ans19No;
    EditText ans20;
    EditText ans21;

    public static String sectionName;
    public static int num;
    MyDBHandler dbHandler;
    FamilyInformationClass obj2=new FamilyInformationClass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_information8);
        q18=(TextView)findViewById(R.id.q18);
        q19=(TextView)findViewById(R.id.q19);
        q20=(TextView)findViewById(R.id.q20);
        q21=(TextView)findViewById(R.id.q21);

        ans18=(EditText) findViewById(R.id.ans18);
        ans20=(EditText) findViewById(R.id.ans20);
        ans19Yes=(RadioButton) findViewById(R.id.ans19Yes);
        ans19No=(RadioButton) findViewById(R.id.ans19No);
        ans21=(EditText) findViewById(R.id.ans21);




        dbHandler = new MyDBHandler(this, null, null, 1);


    }
    public void onClickedNextButton(View view){

        FamilyInformationClass questions=new FamilyInformationClass();

        questions.setQuestion18(q18.getText().toString());
        questions.setQuestion19(q19.getText().toString());
        questions.setQuestion20(q20.getText().toString());
        questions.setQuestion21(q21.getText().toString());


        FamilyInformationClass answers=new FamilyInformationClass();
        answers.setAnswer18(ans18.getText().toString());
        answers.setAnswer20(ans20.getText().toString());
        answers.setAnswer21(ans21.getText().toString());



        dbHandler.insertFamilyInformationQuestions8(questions,answers,getfinalValue(),getSectionName(),obj2);


        Intent intent=new Intent(this,FamilyInformationActivity9.class);
        startActivity(intent);
    }
public  void  onClickedBackButton(View view){
    Intent intent=new Intent(this,FamilyInformationActivity7.class);
    startActivity(intent);
}

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans19Yes:
                if (checked) {
                    String answer = "Yes";


                    obj2.setAnswer19(answer);


                }
                break;
            case R.id.ans19No:
                if (checked) {
                    String answer = "No";


                    obj2.setAnswer19(answer);


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
