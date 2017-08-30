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

public class SchoolingInformation3Activity extends AppCompatActivity {
    TextView q3;
    TextView q3a;
    RadioButton ans3Yes;
    RadioButton ans3No;
    RadioButton ans3AYes;
    RadioButton ans3ANo;

    public static String sectionName;
    public static int num;
    MyDBHandler dbHandler;
    SchoolingInformationClass obj3a=new SchoolingInformationClass();
    SchoolingInformationClass obj3=new SchoolingInformationClass();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schooling_information3);

        q3 = (TextView) findViewById(R.id.q3);
        q3a = (TextView) findViewById(R.id.q3a);
        ans3Yes=(RadioButton)findViewById(R.id.ans3Yes);
        ans3No=(RadioButton)findViewById(R.id.ans3No);
        ans3AYes=(RadioButton)findViewById(R.id.ans3AYes);
        ans3ANo=(RadioButton)findViewById(R.id.ans3ANo);

        dbHandler = new MyDBHandler(this, null, null, 1);

    }
    public  void onClickedNextButton(View view){
        SchoolingInformationClass question=new SchoolingInformationClass();
        question.setQuestion3(q3.getText().toString());
        question.setQuestion3a(q3a.getText().toString());

        dbHandler.insertSchoolingInformationQuestions3(question,obj3,obj3a,getfinalValue(),getSectionName());


        Intent intent=new Intent(this,SchoolingInformation4Activity.class);
        startActivity(intent);
    }
public void  onClickedBackButton(View view){
    Intent intent=new Intent(this,SchoolingInformation2Activity.class);
    startActivity(intent);
}
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans3Yes:
                if (checked) {
                    String answer = "Yes";


                    obj3.setAnswer3(answer);


                }
                break;
            case R.id.ans3No:
                if (checked) {
                    String answer = "No";


                    obj3.setAnswer3(answer);


                }
                break;

            case R.id.ans3AYes:
                if (checked) {
                    String answer = "Yes";


                    obj3a.setAnswer3a(answer);


                }
                break;

            case R.id.ans3ANo:
                if (checked) {
                    String answer = "No";


                    obj3a.setAnswer3a(answer);


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
