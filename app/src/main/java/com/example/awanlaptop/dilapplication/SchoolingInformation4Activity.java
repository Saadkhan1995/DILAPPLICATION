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

public class SchoolingInformation4Activity extends AppCompatActivity {
    TextView q3b;
    TextView q3c;
    RadioButton ans3BYes;
    RadioButton ans3BNo;
    RadioButton ans3CYes;
    RadioButton ans3CNo;

    public static String sectionName;
    public static int num;
    MyDBHandler dbHandler;
    SchoolingInformationClass obj3b=new SchoolingInformationClass();
    SchoolingInformationClass obj3c=new SchoolingInformationClass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schooling_information4);
        q3b = (TextView) findViewById(R.id.q3b);
        q3c= (TextView) findViewById(R.id.q3c);
        ans3BYes=(RadioButton)findViewById(R.id.ans3BYes);
        ans3BNo=(RadioButton)findViewById(R.id.ans3BNo);
        ans3CYes=(RadioButton)findViewById(R.id.ans3CYes);
        ans3CNo=(RadioButton)findViewById(R.id.ans3CNo);

        dbHandler = new MyDBHandler(this, null, null, 1);


    }
    public  void onClickedNextButton(View view){
        SchoolingInformationClass question=new SchoolingInformationClass();
        question.setQuestion3b(q3b.getText().toString());
        question.setQuestion3c(q3c.getText().toString());

        dbHandler.insertSchoolingInformationQuestions4(question,obj3b,obj3c,getfinalValue(),getSectionName());


        Intent intent=new Intent(this,SchoolingInformation5Activity.class);
        startActivity(intent);
    }
    public void  onClickedBackButton(View view){
        Intent intent=new Intent(this,SchoolingInformation3Activity.class);
        startActivity(intent);
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans3BYes:
                if (checked) {
                    String answer = "Yes";


                    obj3b.setAnswer3b(answer);


                }
                break;
            case R.id.ans3BNo:
                if (checked) {
                    String answer = "No";


                    obj3b.setAnswer3b(answer);


                }
                break;

            case R.id.ans3CYes:
                if (checked) {
                    String answer = "Yes";


                    obj3c.setAnswer3c(answer);


                }
                break;

            case R.id.ans3CNo:
                if (checked) {
                    String answer = "No";


                    obj3c.setAnswer3c(answer);


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
