package com.example.awanlaptop.dilapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SchoolingInformation9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schooling_information9);

    }

    public void onClickedNextButton(View view){
        Intent intent=new Intent(this,SchoolingInformation10Activity.class);
        startActivity(intent);
    }
    public void onClickedBackButton(View view){
        Intent intent=new Intent(this,SchoolingInformation8Activity.class);
        startActivity(intent);
    }

}
