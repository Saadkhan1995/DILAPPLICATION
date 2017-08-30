package com.example.awanlaptop.dilapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class AboutDIL extends AppCompatActivity {
Button button;
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_dil);
        button=(Button)findViewById(R.id.button);
        videoView=(VideoView)findViewById(R.id.videoView);
    }
    /*public void onClick(View view)
    {
String  videopath= "android:resource://com.example.awanlaptop.dilapplication" + R.raw.clip;
    }*/
}
