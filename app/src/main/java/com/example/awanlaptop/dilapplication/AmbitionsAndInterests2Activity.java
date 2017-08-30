package com.example.awanlaptop.dilapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AmbitionsAndInterests2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambitions_and_interests2);

    }
public void onClickedNextButton(View view){
        Intent intent = new Intent(this, AmbitionsAndInterests3Activity.class);
        startActivity(intent);
    }

    public void onClickedBackButton(View view) {
        Intent intent = new Intent(this,AmbitionsAndInterests1Activity.class);
        startActivity(intent);
    }

}

