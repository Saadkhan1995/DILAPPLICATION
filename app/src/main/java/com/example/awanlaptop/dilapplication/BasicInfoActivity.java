package com.example.awanlaptop.dilapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class BasicInfoActivity extends AppCompatActivity {
    Button nextbutton;
    EditText name;
    EditText contactnum;
    EditText date;
    EditText desig;
    EditText starttime;
    EditText endtime;
    EditText villagename;
    RadioButton radioButton;
    MyDBHandler dbHandler;
    String buttonvalue;
    Login obj=new Login();
    private static int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicinfoactivity);
        nextbutton = (Button) findViewById(R.id.nextbutton);
        name = (EditText) findViewById(R.id.name);
        contactnum = (EditText) findViewById(R.id.contactnum);
        date = (EditText) findViewById(R.id.date);
        desig = (EditText) findViewById(R.id.desig);
        starttime = (EditText) findViewById(R.id.starttime);
        endtime = (EditText) findViewById(R.id.endtime);
        villagename = (EditText) findViewById(R.id.villagename);
        dbHandler = new MyDBHandler(this, null, null, 1);

    }

    public void OnClickedBackButton(View view) {
        Intent intent = new Intent(this, loginform.class);
        startActivity(intent);
    }
    public void getradiobuttonvalue(String value)
    {
     buttonvalue=value;
    }
   /* public void getloginvalue(Login login)
    {
        obj=login;
    }*/

    public void onNextbutton(View view) {

        BasicInfo basicInfo = new BasicInfo(name.getText().toString(), contactnum.getText().toString(),
                date.getText().toString(),
                desig.getText().toString(),
                starttime.getText().toString(),
                endtime.getText().toString(),
                villagename.getText().toString()

        );

        dbHandler.insertBasicInfoDetails(basicInfo);
        Toast.makeText(BasicInfoActivity.this,"Added Successfully",Toast.LENGTH_SHORT).show();



       Intent intent = new Intent(this, BasicInfoActivity2.class);
       startActivity(intent);
    }



}



