package com.example.awanlaptop.dilapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity {

    RatingBar ratingbar1;
   TextView qfeedback;
    EditText feedback;
    MyDBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        ratingbar1=(RatingBar)findViewById(R.id.ratingbar1);

        qfeedback = (TextView) findViewById(R.id.qfeedback);

       feedback = (EditText) findViewById(R.id.feedback);

        dbHandler = new MyDBHandler(this, null, null, 1);

    }
    public void onClickFinishButton(View view) {

        SuggestionClass question = new SuggestionClass();
        question.setQuestionfeedback(qfeedback.getText().toString());

        SuggestionClass answers = new SuggestionClass();
        answers.setFeedback(feedback.getText().toString());

            // get values and then displayed in a toast
            String totalStars = "Total Stars:: " + ratingbar1.getNumStars();
            String ratingwithtext = "Rating : " + ratingbar1.getRating();
            String rating= ""+ratingbar1.getRating();
            Toast.makeText(getApplicationContext(), ratingwithtext, Toast.LENGTH_SHORT).show();


        dbHandler.insertFeedBack3(question,answers,rating);

        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    public void onClickBackButton(View view) {
        Intent intent = new Intent(this, SuggestionActivity.class);
        startActivity(intent);
    }



}
