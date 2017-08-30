package com.example.awanlaptop.dilapplication;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginform extends AppCompatActivity {
    EditText emailId;
    EditText PasswordId;
    BasicInfoActivity obj=new BasicInfoActivity();

    Button okbutton;
    MyDBHandler dbHandler;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginform);
        emailId= (EditText)findViewById(R.id.emailId);
        PasswordId=(EditText)findViewById(R.id.PasswordId);
        okbutton=(Button) findViewById(R.id.okbutton);
        dbHandler=new MyDBHandler(this,null,null,1);

    }

    public void Okbutton(View v){
        Login login=new Login(emailId.getText().toString(),PasswordId.getText().toString());
        //Toast.makeText(this,"Added Successfully",Toast.LENGTH_SHORT).show();
        //obj.getloginvalue(login);
        dbHandler.newContentValues();
        dbHandler.insertlogindata(login);
        //  dbHandler.addpassword(signUp);
        Toast.makeText(loginform.this,"Added Successfully",Toast.LENGTH_SHORT).show();
    }
    public void onClickedBackButton(View v){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void OnClickedCancelButton(View view)
    {
        Toast.makeText(this,"Cancel",Toast.LENGTH_SHORT).show();

    }

    public void authenticateLogin(View view) {
        if (emailId.getText().toString().equals("1") &&
                PasswordId.getText().toString().equals("1")) {
           //Toast.makeText(getApplicationContext(), "Hello admin!",
                   // Toast.LENGTH_LONG).show();
            Okbutton(okbutton);
            Intent intent=new Intent(this,BasicInfoActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Please Enter Valid Credentials",
                    Toast.LENGTH_SHORT).show();

        }
    }}
