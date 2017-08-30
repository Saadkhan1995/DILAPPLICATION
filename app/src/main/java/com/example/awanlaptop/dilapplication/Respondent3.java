package com.example.awanlaptop.dilapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Respondent3 extends AppCompatActivity {
    EditText homeaddress;
    MyDBHandler dbHandler;
    EditText sectionname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respondent3);
        homeaddress=(EditText)findViewById(R.id.homeaddress);
        sectionname=(EditText)findViewById(R.id.sectionname);
        dbHandler = new MyDBHandler(this, null, null, 1);

           }
    public void onClickedFinishButton(View view){

        Respondentclass respondentclass=new Respondentclass(homeaddress.getText().toString(),sectionname.getText().toString(),"aabc");

        dbHandler.insertRespondent3HomeAddress(respondentclass);

        Toast.makeText(Respondent3.this,"Added Successfully",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainMenu.class);
        startActivity(intent);
    }
    public  void onClickedBackButton(View view){
        Intent intent=new Intent(this,Respondent2.class);
        startActivity(intent);

    }

}
