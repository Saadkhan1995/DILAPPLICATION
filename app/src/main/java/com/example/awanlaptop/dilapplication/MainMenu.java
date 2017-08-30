package com.example.awanlaptop.dilapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    public void onClickedBackButton(View view) {
        Intent intent = new Intent(this, BasicInfoActivity2.class);
        startActivity(intent);
    }

    public void onClickRespondentsProfiles(View view){

        Log.d("tag", "got it");
        Intent intent=new Intent(this,Respondent.class);
        startActivity(intent);
    }
   public void onClickedMaritalStatus(View view){
    Intent intent=new Intent(this,MaritalStatusActivity.class);
    startActivity(intent);
}
public void onClickedNextButtonFamilyInformation(View view){
        Intent intent=new Intent(this,FamilyInformationActivity.class);
        startActivity(intent);
        }
        public void onClickSchoolingInformation(View view){
            Intent intent=new Intent(this,SchoolingInformationActivity.class);
            startActivity(intent);
        }
    public void onCLickedSiblingsStatus(View view){
        Intent intent=new Intent(this,SiblingsStatusActivity.class);
        startActivity(intent);
    }
    public void  onClickedAmbitionsandInterests(View view){
        Intent intent=new Intent(this,AmbitionsAndInterestsActivity.class);
        startActivity(intent);
    }

public void onClickSuggestionButton(View view){
    Intent intent=new Intent(this,SuggestionActivity.class);
    startActivity(intent);
}
   /* public void onClickedNextButton(View view){
        Intent intent=new Intent(this,);
        startActivity(intent);
    }*/


        }
