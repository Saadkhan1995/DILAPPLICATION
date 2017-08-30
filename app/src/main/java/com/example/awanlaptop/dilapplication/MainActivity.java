package com.example.awanlaptop.dilapplication;

import android.content.ContentValues;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button LoginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginButton=(Button)findViewById(R.id.LoginButton);



    }
    public void onClick(View view){
        Intent intent=new Intent(this,loginform.class);
        startActivity(intent);
    }




    /* public void OnClickedOkButton(View view)
     {
         Signup signUp=new Signup(emailId.getText().toString());
         //Toast.makeText(this,"Added Successfully",Toast.LENGTH_SHORT).show();
         dbHandler.addemail(signUp);
         dbHandler.addpassword(signUp);
         Toast.makeText(this,"Added Successfully",Toast.LENGTH_SHORT).show();

     }*/
    public void OnClickedCancelButton(View view)
    {
        Toast.makeText(this,"Cancel",Toast.LENGTH_SHORT).show();
    }

}
