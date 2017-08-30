package com.example.awanlaptop.dilapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.awanlaptop.dilapplication.R.id.radioButton;

public class BasicInfoActivity2 extends AppCompatActivity{
    RadioButton r;
    RadioButton r2;
    RadioButton r3;
    RadioButton r4;
    RadioButton r5;
    RadioButton r6;
    RadioButton r7;
    BasicInfoActivity obj=new BasicInfoActivity();
    String projectname;
    String projectname1;
    MyDBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicinfoactivity2);
            r = (RadioButton) findViewById(radioButton);
        r2 = (RadioButton) findViewById(R.id.radioButton2);
        r3 = (RadioButton) findViewById(R.id.radioButton3);
        r4 = (RadioButton) findViewById(R.id.radioButton4);
        r5 = (RadioButton) findViewById(R.id.radioButton5);
        r6 = (RadioButton) findViewById(R.id.radioButton6);
        r7 = (RadioButton) findViewById(R.id.radioButton7);
        dbHandler = new MyDBHandler(this, null, null, 1);




    }
    public void OnClickedBackButton(View view) {
        Intent intent = new Intent(this, BasicInfoActivity.class);
        startActivity(intent);
    }
    public void onClickedNextButton(View v){

      /* BasicInfo basicInfo=new BasicInfo(projectname);
        dbHandler.insertRadioButtonValue(basicInfo);


        Toast.makeText(BasicInfoActivity2.this,"Added Successfully",Toast.LENGTH_SHORT).show();*/

        Intent intent=new Intent(this,MainMenu.class);
        startActivity(intent);
    }


    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
       // Log.d("hamza","other info" + checked );

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radioButton:
                if (checked)
                {
                    projectname = "KK DIR";

                    BasicInfo basicInfo = new BasicInfo(projectname);


                    dbHandler.insertBasicInfoRadioButtonValue(basicInfo);

                }
                    break;
            case R.id.radioButton2:
                if (checked)
                {
                    projectname = "ICT";
                    BasicInfo basicInfo = new BasicInfo(projectname);


                    dbHandler.insertBasicInfoRadioButtonValue(basicInfo);
                }

                    break;
            case R.id.radioButton3:
                if (checked)
                {
                    projectname = "IRC";
                    BasicInfo basicInfo = new BasicInfo(projectname);


                    dbHandler.insertBasicInfoRadioButtonValue(basicInfo);

                }

                    break;
            case R.id.radioButton4:
                if (checked)
                {
                    projectname = "Mansehra";
                    BasicInfo basicInfo = new BasicInfo(projectname);


                    dbHandler.insertBasicInfoRadioButtonValue(basicInfo);
                }
                    break;
            case R.id.radioButton5:
                {
                if (checked)
                    projectname = "NOWA";
                    BasicInfo basicInfo = new BasicInfo(projectname);


                    dbHandler.insertBasicInfoRadioButtonValue(basicInfo);
                }
                    break;
            case R.id.radioButton6:
                {
                if (checked)
                    projectname = "ORANGI";
                    BasicInfo basicInfo = new BasicInfo(projectname);


                    dbHandler.insertBasicInfoRadioButtonValue(basicInfo);
                }
                    break;
            case R.id.radioButton7:
                if (checked)
                {
                    projectname = "RRP";
                    BasicInfo basicInfo = new BasicInfo(projectname);


                    dbHandler.insertBasicInfoRadioButtonValue(basicInfo);


                }
                break;
        }
    }

}