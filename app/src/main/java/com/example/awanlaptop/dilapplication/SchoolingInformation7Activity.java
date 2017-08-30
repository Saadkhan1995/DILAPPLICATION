package com.example.awanlaptop.dilapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class SchoolingInformation7Activity extends AppCompatActivity {

    RadioButton ans6h;
    RadioButton ans6i;
    RadioButton ans6j;
    RadioButton ans6k;
    RadioButton ans6l;
    RadioButton ans6m;

    public String answer1;

    public static String sectionName;
    public static int num;

    public static String question6;
    MyDBHandler dbHandler;

    EditText ans6n;

    SchoolingInformationClass obj6=new SchoolingInformationClass();
    SchoolingInformationClass obj6b=new SchoolingInformationClass();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schooling_information7);

        ans6h=(RadioButton)findViewById(R.id.ans6h);
        ans6i=(RadioButton)findViewById(R.id.ans6i);
        ans6j=(RadioButton)findViewById(R.id.ans6j);
        ans6k=(RadioButton)findViewById(R.id.ans6k);
        ans6l=(RadioButton)findViewById(R.id.ans6l);

        ans6n=(EditText) findViewById(R.id.ans6n);

        dbHandler = new MyDBHandler(this, null, null, 1);
       
    }
    public void onClickedNextButton(View view){
        SchoolingInformationClass answers = new SchoolingInformationClass();
        answers.setEdittextanswer(ans6n.getText().toString());

       String edittxt= ans6n.getText().toString();
        if(TextUtils.isEmpty(edittxt))
        {

        }


        dbHandler.insertSchoolingInformationQuestions6b(getQuestion6(),obj6,getfinalValue(),getSectionName(),answers);

        Intent intent=new Intent(this,SchoolingInformation8Activity.class);
        startActivity(intent);
    }
    public void  onClickedBackButton(View view){
        Intent intent=new Intent(this,SchoolingInformation6Activity.class);
        startActivity(intent);
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans6h:
                if (checked) {
                    String answer = "I had to take up a paid job outside of home to support my family";


                    obj6.setAnswer6(" ",answer);





                }
                break;
            case R.id.ans6i:
                if (checked) {
                    String answer = "I got engaged";


                    obj6.setAnswer6(" ",answer);




                }
                break;

            case R.id.ans6j:
                if (checked) {
                    String answer = "I got married";


                    obj6.setAnswer6(" ",answer);




                }
                break;

            case R.id.ans6k:
                if (checked) {
                    String answer = "Poor career counseling at DIL School";


                    obj6.setAnswer6(" ",answer);





                }
                break;

            case R.id.ans6l:
                if (checked) {
                    String answer = "Due to Cultural Constraint";


                    obj6.setAnswer6(" ",answer);




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

    public  void throwQuestion(String question6)
    {

        this.question6=question6;


    }

    public static String getQuestion6() {
        return question6;
    }

    public String settextvalue()
    {
        String a = ans6n.getText().toString();
        Log.d("hamza" , ans6n.getText().toString() );

        obj6.setAnswer6(answer1,a);
        return  ans6n.getText().toString();

    }
}
