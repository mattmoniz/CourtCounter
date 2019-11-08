package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA;
    int scoreTeamB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /*increases score to 1 for team A*/
    public void addOneforTeamA(View v){
        displayForTeamA(scoreTeamA+=1);
    }

    /*increases score to 2 for team A*/
    public void addTwoforTeamA(View v){
        displayForTeamA(scoreTeamA+=2);
    }

    /*increases score to 3 for team A*/
    public void addThreeforTeamA(View v){
        displayForTeamA(scoreTeamA+=3);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /*increases score to 1 for team B*/
    public void addOneforTeamB(View v){
        displayForTeamB(scoreTeamB+=1);
    }

    /*increases score to 2 for team B*/
    public void addTwoforTeamB(View v){
        displayForTeamB(scoreTeamB+=2);
    }

    /*increases score to 3 for team B*/
    public void addThreeforTeamB(View v){
        displayForTeamB(scoreTeamB+=3);
    }

    public void resetBothScores(View v){
        displayForTeamA(scoreTeamA=0);
        displayForTeamB(scoreTeamB=0);
    }


}
