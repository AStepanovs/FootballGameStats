package com.example.android.footballgamestats;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreHomeTeam = 0;
    int scoreAwayTeam = 0;
    int yellowCardsHome = 0;
    int yellowCardsAway = 0;
    int redCardsHome = 0;
    int redCardsAway = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void addScoreForHTeam(View v) {
        scoreHomeTeam = scoreHomeTeam + 1;
        displayHTeamScore(scoreHomeTeam);
    }
    public void addYellowForHTeam(View v){
        yellowCardsHome = yellowCardsHome +1;
        displayHTeamYellow(yellowCardsHome);
    }

    public void addRedForHTeam(View v){
        redCardsHome = redCardsHome + 1;
        displayHTeamRed(redCardsHome);
    }

    public void addScoreForATeam(View v) {
        scoreAwayTeam = scoreAwayTeam + 1;
        displayATeamScore(scoreAwayTeam);
    }
    public void addYellowForATeam(View v){
        yellowCardsAway = yellowCardsAway +1;
        displayATeamYellow(yellowCardsAway);
    }

    public void addRedForATeam(View v){
        redCardsAway = redCardsAway + 1;
        displayATeamRed(redCardsAway);
    }


    public void displayHTeamScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayHTeamYellow(int y_cards) {
        TextView scoreView = (TextView) findViewById(R.id.home_team_yellow);
        scoreView.setText(String.valueOf(y_cards));
    }
    public void displayHTeamRed(int r_cards) {
        TextView scoreView = (TextView) findViewById(R.id.home_team_red);
        scoreView.setText(String.valueOf(r_cards));
    }
    public void displayATeamScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_team_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayATeamYellow(int y_cards) {
        TextView scoreView = (TextView) findViewById(R.id.away_team_yellow);
        scoreView.setText(String.valueOf(y_cards));
    }
    public void displayATeamRed(int r_cards) {
        TextView scoreView = (TextView) findViewById(R.id.away_team_red);
        scoreView.setText(String.valueOf(r_cards));
    }
    public void resetScores (View v){
        scoreHomeTeam = 0;
        scoreAwayTeam = 0;
        yellowCardsHome = 0;
        yellowCardsAway = 0;
        redCardsHome = 0;
        redCardsAway = 0;
        displayHTeamScore(scoreHomeTeam);
        displayATeamScore(scoreAwayTeam);
        displayHTeamYellow(yellowCardsHome);
        displayATeamYellow(yellowCardsAway);
        displayHTeamRed(redCardsHome);
        displayATeamRed(redCardsAway);
    }

}
