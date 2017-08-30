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
import android.widget.Toast;

public class Respondent extends AppCompatActivity {
    Button nextbutton;
    Button backbutton;
    EditText nameOfStudent;

    EditText contactnum;
    EditText schoolname;
    EditText respondentemailaddress;
    MyDBHandler dbHandler;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respondent);
        nextbutton=(Button) findViewById(R.id.nextbutton);
        backbutton=(Button) findViewById(R.id.backbutton);

        nameOfStudent=(EditText)findViewById(R.id.nameOfStudent);
        contactnum=(EditText) findViewById(R.id.contactnum);
        schoolname=(EditText)findViewById(R.id.schoolname);
        respondentemailaddress=(EditText) findViewById(R.id.respondentemailId);
        dbHandler = new MyDBHandler(this, null, null, 1);


    }
    public void onClickedBackButton(View view)
    {
        Intent intent=new Intent(this,MainMenu.class);
        startActivity(intent);
    }
   public void onClickedNextButton(View view)
{
    Log.d("hamza" , "1");


    Respondentclass respondentclass=new Respondentclass(nameOfStudent.getText().toString(),contactnum.getText().toString(),
                                     schoolname.getText().toString(),respondentemailaddress.getText().toString());



    Log.d("hamza" , "2");

// passing object to MyDBHandler class's function insertRespondentDetails
  dbHandler.insertRespondentDetails(respondentclass);

    Toast.makeText(Respondent.this,"Added Successfully",Toast.LENGTH_SHORT).show();

    Intent intent=new Intent(this,Respondent2.class);
    startActivity(intent);

}
}
