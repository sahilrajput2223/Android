package com.example.android.cricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamAWicket = 0;
    int teamAOver = 0;
    int teamABall = 0;

    int teamBScore = 0;
    int teamBWicket = 0;
    int teamBOver = 0;
    int teamBBall = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score, int wicket, int over, int ball) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score) + "/" + String.valueOf(wicket));

        TextView overView = (TextView) findViewById(R.id.team_a_over);
        overView.setText(String.valueOf(over) + "." + String.valueOf(ball));
    }

    public void displayForTeamB(int score, int wicket, int over, int ball) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score) + "/" + String.valueOf(wicket));

        TextView overView = (TextView) findViewById(R.id.team_b_over);
        overView.setText(String.valueOf(over) + "." + String.valueOf(ball));
    }

    public void allOutTeamA() {
        TextView All = (TextView) findViewById(R.id.team_a_score);
        All.setText("All");

        TextView Out = (TextView) findViewById(R.id.team_a_over);
        Out.setText("Out");
    }


    public void allOutTeamB() {
        TextView All = (TextView) findViewById(R.id.team_b_score);
        All.setText("All");

        TextView Out = (TextView) findViewById(R.id.team_b_over);
        Out.setText("Out");
    }



    public void addSixRunInA(View view) {
        teamAScore += 6;

        if(teamABall != 5){
            teamABall += 1;
        }
        else{
            teamABall = 0;
            teamAOver += 1;
        }

        displayForTeamA(teamAScore, teamAWicket, teamAOver, teamABall);
    }

    public void addFiveRunInA(View view) {
        teamAScore += 5;

        if(teamABall != 5){
            teamABall += 1;
        }
        else{
            teamABall = 0;
            teamAOver += 1;
        }
        displayForTeamA(teamAScore, teamAWicket, teamAOver, teamABall);
    }

    public void addFourRunInA(View view) {
        teamAScore += 4;

        if(teamABall != 5){
            teamABall += 1;
        }
        else{
            teamABall = 0;
            teamAOver += 1;
        }
        displayForTeamA(teamAScore, teamAWicket, teamAOver, teamABall);
    }

    public void addThreeRunInA(View view) {
        teamAScore += 3;

        if(teamABall != 5){
            teamABall += 1;
        }
        else{
            teamABall = 0;
            teamAOver += 1;
        }
        displayForTeamA(teamAScore, teamAWicket, teamAOver, teamABall);
    }

    public void addTwoRunInA(View view) {
        teamAScore += 2;

        if(teamABall != 5){
            teamABall += 1;
        }
        else{
            teamABall = 0;
            teamAOver += 1;
        }
        displayForTeamA(teamAScore, teamAWicket, teamAOver, teamABall);
    }

    public void addOneRunInA(View view) {
        teamAScore += 1;

        if(teamABall != 5){
            teamABall += 1;
        }
        else{
            teamABall = 0;
            teamAOver += 1;
        }
        displayForTeamA(teamAScore, teamAWicket, teamAOver, teamABall);
    }

    public void addWicketInA(View view) {
        teamAWicket += 1;

        if(teamABall != 5){
            teamABall += 1;
        }
        else{
            teamABall = 0;
            teamAOver += 1;
        }

        if(teamAWicket == 10){
            allOutTeamA();
        }
        else{
            displayForTeamA(teamAScore, teamAWicket, teamAOver, teamABall);
        }

    }


    public void addSixRunInB(View view) {
        teamBScore += 6;

        if(teamBBall != 5){
            teamBBall += 1;
        }
        else{
            teamBBall = 0;
            teamBOver += 1;
        }

        displayForTeamB(teamBScore, teamBWicket, teamBOver, teamBBall);
    }

    public void addFiveRunInB(View view) {
        teamBScore += 5;

        if(teamBBall != 5){
            teamBBall += 1;
        }
        else{
            teamBBall = 0;
            teamBOver += 1;
        }

        displayForTeamB(teamBScore, teamBWicket, teamBOver, teamBBall);
    }

    public void addFourRunInB(View view) {
        teamBScore += 4;

        if(teamBBall != 5){
            teamBBall += 1;
        }
        else{
            teamBBall = 0;
            teamBOver += 1;
        }

        displayForTeamB(teamBScore, teamBWicket, teamBOver, teamBBall);
    }

    public void addThreeRunInB(View view) {
        teamBScore += 3;

        if(teamBBall != 5){
            teamBBall += 1;
        }
        else{
            teamBBall = 0;
            teamBOver += 1;
        }

        displayForTeamB(teamBScore, teamBWicket, teamBOver, teamBBall);
    }

    public void addTwoRunInB(View view) {
        teamBScore += 2;

        if(teamBBall != 5){
            teamBBall += 1;
        }
        else{
            teamBBall = 0;
            teamBOver += 1;
        }

        displayForTeamB(teamBScore, teamBWicket, teamBOver, teamBBall);
    }

    public void addOneRunInB(View view) {
        teamBScore += 1;

        if(teamBBall != 5){
            teamBBall += 1;
        }
        else{
            teamBBall = 0;
            teamBOver += 1;
        }

        displayForTeamB(teamBScore, teamBWicket, teamBOver, teamBBall);
    }

    public void addWicketInB(View view) {
        teamBWicket += 1;

        if(teamBBall != 5){
            teamBBall += 1;
        }
        else{
            teamBBall = 0;
            teamBOver += 1;
        }

        if(teamBWicket == 10){
            allOutTeamB();
        }
        else{
            displayForTeamB(teamBScore, teamBWicket, teamBOver, teamBBall);
        }

    }

    public void resetGame(View view) {
        teamAWicket = 0;
        teamBWicket = 0;
        teamAOver = 0;
        teamBOver = 0;
        teamAScore = 0;
        teamBScore = 0;
        teamABall = 0;
        teamBBall = 0;

        displayForTeamA(teamAScore, teamAWicket, teamAOver, teamABall);
        displayForTeamB(teamBScore, teamBWicket, teamBOver, teamBBall);
    }
}
