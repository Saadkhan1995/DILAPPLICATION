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
import android.widget.RadioButton;
import android.widget.TextView;

public class MaritalStatus2Activity extends AppCompatActivity {

    TextView q5;
    TextView q4;
    EditText ans5;
    MaritalStatusClass obj4;

    RadioButton ans4Yes;
    RadioButton ans4No;

   public static String sectionName;

    MyDBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marital_status2);
        q5=(TextView)findViewById(R.id.q5);


        dbHandler = new MyDBHandler(this, null, null, 1);
        ans5=(EditText) findViewById(R.id.ans5);
        q4=(TextView)findViewById(R.id.q4);

        ans4Yes=(RadioButton) findViewById(R.id.ans4Yes);
        ans4No=(RadioButton) findViewById(R.id.ans4No);


    }
    public void OnClickFinishButton(View view) {

         MaritalStatusClass question1=new MaritalStatusClass();
        MaritalStatusClass question=new MaritalStatusClass();
        question.setQuestion4(q4.getText().toString());
        question.setQuestion5(q5.getText().toString());



        MaritalStatusClass maritalStatusClass5=new MaritalStatusClass(ans5.getText().toString(),
                                                                      "a","b","c","b" );



        dbHandler.insertMaritalStatusQuestionsActivity2(question,maritalStatusClass5,obj4,getSectionName());




        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
    public  void onClickedBackButton(View view)
    {
        Intent intent=new Intent(this,MaritalStatusActivity.class);
        startActivity(intent);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans4Yes:
                if (checked) {
                    String answer = "Yes";

                    obj4 = new MaritalStatusClass(answer,"aa","bb","cc");




                }
                break;


            case R.id.ans4No:
                if (checked) {
                    String answer = "No";


                    obj4 = new MaritalStatusClass(answer,"aa","bb","cc");



                }
                break;


        }
        }
    public  void getvalue(String section)
    {

       this.sectionName=section;


    }
    public String getSectionName()
    {
     return sectionName;
    }

}

