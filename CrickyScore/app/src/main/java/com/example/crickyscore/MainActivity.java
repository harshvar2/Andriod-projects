package com.example.crickyscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score=0;
    int scoreb=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(score);
        displayForTeamB(scoreb);
    }

    public void addtwo(View V){
        score=score+2;
        displayForTeamA(score);
    }
    public void addfour(View V){
        score=score+4;
        displayForTeamA(score);
    }
    public void addsix(View V){
        score=score+6;
        displayForTeamA(score);
    }
    public void reset(View V){
        score=0;
        scoreb=0;
        displayForTeamA(score);
        displayForTeamB(scoreb);
    }
    public void addtwob(View VV){
        scoreb=scoreb+2;
        displayForTeamB(scoreb);
    }
    public void addfourb(View VV){
        scoreb=scoreb+4;
        displayForTeamB(scoreb);
    }
    public void addsixb(View VV){
        scoreb=scoreb+6;
        displayForTeamB(scoreb);
    }




    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int scoreb) {
        TextView scoreView1 = (TextView) findViewById(R.id.teamb);
        scoreView1.setText(String.valueOf(scoreb));
    }

}
