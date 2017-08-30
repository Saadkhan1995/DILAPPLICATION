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

public class SchoolingInformation6Activity extends AppCompatActivity {

    TextView q6;
    RadioButton ans6a;
    RadioButton ans6b;
    RadioButton ans6c;
    RadioButton ans6d;
    RadioButton ans6e;
    RadioButton ans6f;
    RadioButton ans6g;
    public static String sectionName;
    public static String question6;
    public static boolean methodAHasRunOnce = false;
    public static int num;
    MyDBHandler dbHandler;
    SchoolingInformationClass obj6=new SchoolingInformationClass();
    SchoolingInformation7Activity obj7 = new SchoolingInformation7Activity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schooling_information6);

        q6 = (TextView) findViewById(R.id.q6);
        ans6a=(RadioButton)findViewById(R.id.ans6a);
        ans6b=(RadioButton)findViewById(R.id.ans6b);
        ans6c=(RadioButton)findViewById(R.id.ans6c);
        ans6d=(RadioButton)findViewById(R.id.ans6d);
        ans6e=(RadioButton)findViewById(R.id.ans6e);
        ans6f=(RadioButton)findViewById(R.id.ans6f);
        ans6g=(RadioButton)findViewById(R.id.ans6g);
        dbHandler = new MyDBHandler(this, null, null, 1);

    }
public void onClickedNextButton(View view){

    SchoolingInformationClass question=new SchoolingInformationClass();
    question.setQuestion6(q6.getText().toString());

    question6= q6.getText().toString();


    obj7.throwQuestion(question6);
    if(methodAHasRunOnce ==true)
    {


        dbHandler.insertSchoolingInformationQuestions6(question, obj6, getfinalValue(), getSectionName());

    }
    Intent intent=new Intent(this,SchoolingInformation7Activity.class);
    startActivity(intent);
}
    public void  onClickedBackButton(View view){
        Intent intent=new Intent(this,SchoolingInformation5Activity.class);
        startActivity(intent);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        methodAHasRunOnce = true;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans6a:
                if (checked) {
                    String answer = "My Family did not approve of my continuing education";


                    obj6.setAnswer6(" ", answer);





                }
                break;
            case R.id.ans6b:
                if (checked) {
                    String answer = "I found school work too difficult";


                    obj6.setAnswer6(" ",answer);




                }
                break;

            case R.id.ans6c:
                if (checked) {
                    String answer = "The teacher at my school were very strict";


                    obj6.setAnswer6(" ",answer);




                }
                break;

            case R.id.ans6d:
                if (checked) {
                    String answer = "My Family could no longer bear education-related expenses";


                    obj6.setAnswer6(" ",answer);





                }
                break;

            case R.id.ans6e:
                if (checked) {
                    String answer = "I was not learning much";


                    obj6.setAnswer6(" ",answer);




                }
                break;

            case R.id.ans6f:
                if (checked) {
                    String answer = "I was not interested in continuing my education";


                    obj6.setAnswer6(" ",answer);



                }
                break;
            case R.id.ans6g:
                if (checked) {
                    String answer = "I had to help my family with household chores or agricultural work";


                    obj6.setAnswer6(" ", answer);



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
