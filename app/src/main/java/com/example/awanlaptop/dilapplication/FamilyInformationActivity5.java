package com.example.awanlaptop.dilapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class FamilyInformationActivity5 extends AppCompatActivity {
    TextView q9;
    RadioButton ans9a;
    RadioButton ans9b;
    RadioButton ans9c;
    RadioButton ans9d;
    RadioButton ans9e;
    RadioButton ans9f;
    MyDBHandler dbHandler;
    FamilyInformationClass obj2=new FamilyInformationClass();

    public static String sectionName;
    public static int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_information5);
        q9 = (TextView) findViewById(R.id.q9);
        ans9a=(RadioButton)findViewById(R.id.ans9a);
        ans9b=(RadioButton)findViewById(R.id.ans9b);
        ans9c=(RadioButton)findViewById(R.id.ans9c);
        ans9d=(RadioButton)findViewById(R.id.ans9d);
        ans9e=(RadioButton)findViewById(R.id.ans9e);
        ans9f=(RadioButton)findViewById(R.id.ans9f);
        dbHandler = new MyDBHandler(this, null, null, 1);

    }
    public void onClickedNextButton(View view){

        FamilyInformationClass question=new FamilyInformationClass();
        question.setQuestion9(q9.getText().toString());
        dbHandler.insertFamilyInformationQuestions5(question,obj2,getfinalValue(),getSectionName());

        Intent intent=new Intent(this,FamilyInformationActivity6.class);
        startActivity(intent);
    }
    public void onClickedBackButton(View view){
        Intent intent=new Intent(this,FamilyInformationActivity4.class);
        startActivity(intent);
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans9a:
                if (checked) {
                    String answer = "Illiterate";


                    obj2.setAnswer9(answer);





                }
                break;
            case R.id.ans9b:
                if (checked) {
                    String answer = "Primary";


                    obj2.setAnswer9(answer);




                }
                break;

            case R.id.ans9c:
                if (checked) {
                    String answer = "Middle";


                    obj2.setAnswer9(answer);




                }
                break;

            case R.id.ans9d:
                if (checked) {
                    String answer = "HighSchool";


                    obj2.setAnswer9(answer);





                }
                break;

            case R.id.ans9e:
                if (checked) {
                    String answer = "Intermediate";


                    obj2.setAnswer9(answer);




                }
                break;

            case R.id.ans9f:
                if (checked) {
                    String answer = "Bachelor and Above";


                    obj2.setAnswer9(answer);



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
