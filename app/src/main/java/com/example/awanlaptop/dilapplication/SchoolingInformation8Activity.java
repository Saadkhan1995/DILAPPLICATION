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

public class SchoolingInformation8Activity extends AppCompatActivity {

    TextView q7;
    RadioButton ans7a;
    RadioButton ans7b;
    RadioButton ans7c;
    RadioButton ans7d;
    RadioButton ans7e;
    public static String sectionName;
    public static int num;
    MyDBHandler dbHandler;
    SchoolingInformationClass obj2=new SchoolingInformationClass();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schooling_information8);

        q7 = (TextView) findViewById(R.id.q7);
        ans7a=(RadioButton)findViewById(R.id.ans7a);
        ans7b=(RadioButton)findViewById(R.id.ans7b);

        ans7c=(RadioButton)findViewById(R.id.ans7c);
        ans7d=(RadioButton)findViewById(R.id.ans7d);
        ans7e=(RadioButton)findViewById(R.id.ans7e);
        dbHandler = new MyDBHandler(this, null, null, 1);

    }

    public void onClickedNextButton(View view){
        SchoolingInformationClass question=new SchoolingInformationClass();
        question.setQuestion7(q7.getText().toString());



        dbHandler.insertSchoolingInformationQuestions7(question,obj2,getfinalValue(),getSectionName());


        Intent intent=new Intent(this,SchoolingInformation9Activity.class);
        startActivity(intent);
    }
    public void onClickedBackButton(View view)
    {
        Intent intent=new Intent(this,SchoolingInformation7Activity.class);
        startActivity(intent);

        }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans7a:
                if (checked) {
                    String answer = "Less than 1 year";


                    obj2.setAnswer7(answer);





                }
                break;
            case R.id.ans7b:
                if (checked) {
                    String answer = "Less than 2 year";


                    obj2.setAnswer7(answer);




                }
                break;

            case R.id.ans7c:
                if (checked) {
                    String answer = "Less than 3 year";


                    obj2.setAnswer7(answer);




                }
                break;

            case R.id.ans7d:
                if (checked) {
                    String answer = "More than 3 years";


                    obj2.setAnswer7(answer);





                }
                break;

            case R.id.ans7e:
                if (checked) {
                    String answer = "No Gap";


                    obj2.setAnswer7(answer);




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
