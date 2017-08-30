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

public class SchoolingInformation2Activity extends AppCompatActivity {
    TextView q2;
    RadioButton ans2a;
    RadioButton ans2b;
    RadioButton ans2c;
    RadioButton ans2d;
    RadioButton ans2e;
    RadioButton ans2f;
    RadioButton ans2g;
    public static String sectionName;
    public static int num;
    MyDBHandler dbHandler;
    SchoolingInformationClass obj2=new SchoolingInformationClass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schooling_information2);

        q2 = (TextView) findViewById(R.id.q2);
        ans2a=(RadioButton)findViewById(R.id.ans2a);
        ans2b=(RadioButton)findViewById(R.id.ans2b);
        ans2c=(RadioButton)findViewById(R.id.ans2c);
        ans2d=(RadioButton)findViewById(R.id.ans2d);
        ans2e=(RadioButton)findViewById(R.id.ans2e);
        ans2f=(RadioButton)findViewById(R.id.ans2f);
        ans2g=(RadioButton)findViewById(R.id.ans2g);
        dbHandler = new MyDBHandler(this, null, null, 1);



    }
    public void onClickedBackButton(View view){
        Intent intent=new Intent(this,SchoolingInformationActivity.class);
        startActivity(intent);
    }
public void  onClickedNextButton(View view){
    SchoolingInformationClass question=new SchoolingInformationClass();
    question.setQuestion2(q2.getText().toString());



    dbHandler.insertSchoolingInformationQuestions2(question,obj2,getfinalValue(),getSectionName());

    Intent intent=new Intent(this,SchoolingInformation3Activity.class);
    startActivity(intent);

}
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans2a:
                if (checked) {
                    String answer = "Due to easy access";


                    obj2.setAnswer2(answer);





                }
                break;
            case R.id.ans2b:
                if (checked) {
                    String answer = "Due to qualified teachers";


                    obj2.setAnswer2(answer);




                }
                break;

            case R.id.ans2c:
                if (checked) {
                    String answer = "Due to school facilities";


                    obj2.setAnswer2(answer);




                }
                break;

            case R.id.ans2d:
                if (checked) {
                    String answer = "Because there was no other school available";


                    obj2.setAnswer2(answer);





                }
                break;

            case R.id.ans2e:
                if (checked) {
                    String answer = "Due to financial affordability";


                    obj2.setAnswer2(answer);




                }
                break;

            case R.id.ans2f:
                if (checked) {
                    String answer = "Better quality of education";


                    obj2.setAnswer2(answer);



                }
                break;
            case R.id.ans2g:
                if (checked) {
                    String answer = "Other(Please specify)";


                    obj2.setAnswer2(answer);



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
