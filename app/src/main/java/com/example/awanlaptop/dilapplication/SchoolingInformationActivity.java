package com.example.awanlaptop.dilapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class SchoolingInformationActivity extends AppCompatActivity {

    TextView q1;
    EditText numberofquestions;
    EditText sectionnameanswer;
    RadioButton ans1a;
    RadioButton ans1b;
    RadioButton ans1c;
    RadioButton ans1d;
    RadioButton ans1e;
    RadioButton ans1f;
    MyDBHandler dbHandler;
    SchoolingInformationClass obj=new SchoolingInformationClass();
    SchoolingInformation2Activity obj2 = new SchoolingInformation2Activity();
    SchoolingInformation3Activity obj3 = new SchoolingInformation3Activity();
    SchoolingInformation4Activity obj4 = new SchoolingInformation4Activity();
    SchoolingInformation5Activity obj5 = new SchoolingInformation5Activity();
    SchoolingInformation6Activity obj6 = new SchoolingInformation6Activity();
    SchoolingInformation7Activity obj7 = new SchoolingInformation7Activity();
    SchoolingInformation8Activity obj8 = new SchoolingInformation8Activity();
    SchoolingInformation9Activity obj9 = new SchoolingInformation9Activity();
    SchoolingInformation10Activity obj10 = new SchoolingInformation10Activity();
    SchoolingInformation11Activity obj11 = new SchoolingInformation11Activity();

    public static String value;
    public static int finalValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schooling_information);

        q1 = (TextView) findViewById(R.id.q1);
        ans1a=(RadioButton)findViewById(R.id.ans1a);
        ans1b=(RadioButton)findViewById(R.id.ans1b);
        ans1c=(RadioButton)findViewById(R.id.ans1c);
        ans1d=(RadioButton)findViewById(R.id.ans1d);
        ans1e=(RadioButton)findViewById(R.id.ans1e);
        ans1f=(RadioButton)findViewById(R.id.ans1f);
        numberofquestions=(EditText)findViewById(R.id.numberofquestions);
        sectionnameanswer=(EditText)findViewById(R.id.sectionnameanswer);
        dbHandler = new MyDBHandler(this, null, null, 1);

    }
    public void onClickedBackButton(View view){
        Intent intent=new Intent(this,MainMenu.class);
        startActivity(intent);
    }
    public void onClickedNextButton(View view){
        SchoolingInformationClass question=new SchoolingInformationClass();
        question.setSection(sectionnameanswer.getText().toString());
        question.setQuestion1(q1.getText().toString());


        String num= numberofquestions.getText().toString();
        finalValue=Integer.parseInt(num);

        value= sectionnameanswer.getText().toString();

        if(TextUtils.isEmpty(num)) {

            numberofquestions.setError("Please Enter number of Questions");

        }

        obj2.getvalue2(value);
        obj2.getnumberofquestions(finalValue);

        obj3.getvalue2(value);
        obj3.getnumberofquestions(finalValue);

        obj4.getvalue2(value);
        obj4.getnumberofquestions(finalValue);

        obj5.getvalue2(value);
        obj5.getnumberofquestions(finalValue);

        obj6.getvalue2(value);
        obj6.getnumberofquestions(finalValue);

        obj7.getvalue2(value);
        obj7.getnumberofquestions(finalValue);

        obj8.getvalue2(value);
        obj8.getnumberofquestions(finalValue);


        dbHandler.insertSchoolingInformationQuestions1(question,obj,finalValue);


        Intent intent=new Intent(this,SchoolingInformation2Activity.class);
        startActivity(intent);
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans1a:
                if (checked) {
                    String answer = "Through community member";


                    obj.setAnswer1(answer);





                }
                break;
            case R.id.ans1b:
                if (checked) {
                    String answer = "Through DIL school staff";


                    obj.setAnswer1(answer);




                }
                break;

            case R.id.ans1c:
                if (checked) {
                    String answer = "Admitted by parents/guardian";


                    obj.setAnswer1(answer);




                }
                break;

            case R.id.ans1d:
                if (checked) {
                    String answer = "Don't remember";


                    obj.setAnswer1(answer);





                }
                break;

            case R.id.ans1e:
                if (checked) {
                    String answer = "Through DIL school student";


                    obj.setAnswer1(answer);




                }
                break;

            case R.id.ans1f:
                if (checked) {
                    String answer = "Other(Please specify)";


                    obj.setAnswer1(answer);



                }
                break;

        }


    }
}
