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
import android.widget.Toast;

public class Respondent2 extends AppCompatActivity {
 String gender;
    MyDBHandler dbHandler;
    String maritalstatus;
    EditText dateofbirth;
    EditText mothertongue;

    RadioButton male;
    RadioButton female;
    RadioButton married;
    RadioButton unmarried;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respondent2);
        dateofbirth=(EditText)findViewById(R.id.dateofbirth);
        mothertongue=(EditText)findViewById(R.id.modertongue);

        male = (RadioButton) findViewById(R.id.male);
        female = (RadioButton) findViewById(R.id.female);
        married = (RadioButton) findViewById(R.id.married);
        unmarried = (RadioButton) findViewById(R.id.unmarried);
        dbHandler = new MyDBHandler(this, null, null, 1);

    }
    public void onclickednextbutton(View view){

        Respondentclass respondentclass=new Respondentclass(dateofbirth.getText().toString(),mothertongue.getText().toString());


        dbHandler.insertRespondent2EditText(respondentclass);
        Toast.makeText(Respondent2.this,"Added Successfully",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,Respondent3.class);
        startActivity(intent);

    }
    public  void onClickedBackButton(View view){
        Intent intent=new Intent(this,Respondent.class);
        startActivity(intent);

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.male:
                if (checked) {
                    gender = "Male";

                    Respondentclass respondentclass = new Respondentclass(gender);


                    dbHandler.insertRespondent2Gender(respondentclass);

                }
                break;
            case R.id.female:
                if (checked) {
                    gender = "Female";
                    Respondentclass respondentclass = new Respondentclass(gender);

                    Toast.makeText(Respondent2.this,respondentclass.getUstudentGender(),Toast.LENGTH_SHORT).show();
                    dbHandler.insertRespondent2Gender(respondentclass);


                }

                break;
            case R.id.married:
                if (checked) {
                    maritalstatus = "married";
                    Respondentclass respondentclass = new Respondentclass(maritalstatus, "abc", "abc", "abc", "abc");

                    dbHandler.insertRespondent2Maritalstatus(respondentclass);

                }

                break;
            case R.id.unmarried:
                if (checked) {
                    maritalstatus = "unmarried";
                    Respondentclass respondentclass = new Respondentclass(maritalstatus, "abc", "abc", "abc", "abc");

                    dbHandler.insertRespondent2Maritalstatus(respondentclass);
                }
                break;

        }
    }
}
