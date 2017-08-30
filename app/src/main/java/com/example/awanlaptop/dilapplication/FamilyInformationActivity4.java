package com.example.awanlaptop.dilapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class FamilyInformationActivity4 extends AppCompatActivity {
    TextView q8;
    RadioButton ans8a;
    RadioButton ans8b;
    RadioButton ans8c;
    RadioButton ans8d;
    RadioButton ans8e;
    RadioButton ans8f;
    MyDBHandler dbHandler;
    FamilyInformationClass obj2=new FamilyInformationClass();

    public static String sectionName;
    public static int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_information4);
        q8 = (TextView) findViewById(R.id.q8);
        ans8a=(RadioButton)findViewById(R.id.ans8a);
        ans8b=(RadioButton)findViewById(R.id.ans8b);
        ans8c=(RadioButton)findViewById(R.id.ans8c);
        ans8d=(RadioButton)findViewById(R.id.ans8d);
        ans8e=(RadioButton)findViewById(R.id.ans8e);
        ans8f=(RadioButton)findViewById(R.id.ans8f);
        dbHandler = new MyDBHandler(this, null, null, 1);
    }

    public void onClickedNextButton(View view){
        FamilyInformationClass question=new FamilyInformationClass();
        question.setQuestion8(q8.getText().toString());
        dbHandler.insertFamilyInformationQuestions4(question,obj2,getfinalValue(),getSectionName());
        Intent intent=new Intent(this,FamilyInformationActivity5.class);
        startActivity(intent);

    }
    public  void  onClickedBackButton(View view){
        Intent intent=new Intent(this,FamilyInformationActivity3.class);
        startActivity(intent);
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans8a:
                if (checked) {
                    String answer = "Illiterate";


                    obj2.setAnswer8(answer);





                }
                break;
            case R.id.ans8b:
                if (checked) {
                    String answer = "Primary";


                    obj2.setAnswer8(answer);




                }
                break;

            case R.id.ans8c:
                if (checked) {
                    String answer = "Middle";


                    obj2.setAnswer8(answer);




                }
                break;

            case R.id.ans8d:
                if (checked) {
                    String answer = "HighSchool";


                    obj2.setAnswer8(answer);





                }
                break;

            case R.id.ans8e:
                if (checked) {
                    String answer = "Intermediate";


                    obj2.setAnswer8(answer);




                }
                break;

            case R.id.ans8f:
                if (checked) {
                    String answer = "Bachelor and Above";


                    obj2.setAnswer8(answer);



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
