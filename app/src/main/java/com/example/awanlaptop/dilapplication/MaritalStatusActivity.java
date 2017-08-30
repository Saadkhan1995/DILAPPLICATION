package com.example.awanlaptop.dilapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MaritalStatusActivity extends AppCompatActivity {
    TextView q1;
    TextView q2;
    TextView q3;


    EditText ans1;
    EditText ans3;

    RadioButton ans2Yes;
    RadioButton ans2No;
    public static String value;

    EditText sectionnameanswer;



    EditText numberofquestions;
    MyDBHandler dbHandler;

    MaritalStatus2Activity obj = new MaritalStatus2Activity();

    MaritalStatusClass obj2= new MaritalStatusClass();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marital_status);
        q1=(TextView)findViewById(R.id.q1);
        q2=(TextView)findViewById(R.id.q2);
        q3=(TextView)findViewById(R.id.q3);


        ans1=(EditText) findViewById(R.id.ans1);
        ans3=(EditText) findViewById(R.id.ans3);

        ans2Yes=(RadioButton) findViewById(R.id.ans2Yes);
        ans2No=(RadioButton) findViewById(R.id.ans2No);


        sectionnameanswer=(EditText) findViewById(R.id.sectionnameanswer);




        numberofquestions=(EditText)findViewById(R.id.numberofquestions);
        dbHandler = new MyDBHandler(this, null, null, 1);

    }
    public  void onClickedNextButton(View view)
    {

        //dbHandler.copyRow();
        MaritalStatusClass questions=new MaritalStatusClass();
        questions.setSection(sectionnameanswer.getText().toString());
        value = sectionnameanswer.getText().toString();
        obj.getvalue(value);

        questions.setQuestion1(q1.getText().toString());
        questions.setQuestion2(q2.getText().toString());
        questions.setQuestion3(q3.getText().toString());


        MaritalStatusClass answer1=new MaritalStatusClass(ans1.getText().toString() );
        MaritalStatusClass answer3=new MaritalStatusClass(ans3.getText().toString(),"aa","bb" );

        String num= numberofquestions.getText().toString();
        int finalValue=Integer.parseInt(num);



        dbHandler.insertMaritalStatusQuestions(questions, finalValue,answer1,answer3,obj2);



        Intent intent=new Intent(this,MaritalStatus2Activity.class);

        startActivity(intent);

    }
    public  void onClickedBackButton(View view)
    {
        Intent intent=new Intent(this,MainMenu.class);
        startActivity(intent);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans2Yes:
                if (checked) {
                   String answer = "Yes";


                    obj2 = new MaritalStatusClass(answer,"aa");




                }
                break;
            case R.id.ans2No:
                if (checked) {
                    String answer = "No";


                     obj2 = new MaritalStatusClass(answer,"aa");




                }
                break;


        }


    }

}
