package com.example.android.taekwondoscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAPointValues = 0, teamBPointValues = 0;
    TextView txtTeamAPoint, txtTeamBPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase points of team A or team B with value increaseValues
     * @param point the current score of team A or team B
     * @param increaseValues the increase value
     * @return total score
     */
    public int IncreasePoint(int point, int increaseValues) {
        point += increaseValues;
        return point;
    }

    /**
     * Display score of team A
     * @param point the score of team A for show
     */
    public void displayForTeamA(int point) {
        txtTeamAPoint = (TextView) findViewById(R.id.teamAPoint);
        txtTeamAPoint.setText(String.valueOf(point));
    }

    /**
     * Display score of team B
     *  @param point the score of team B for show
     */
    public void displayForTeamB(int point) {
        txtTeamBPoint = (TextView) findViewById(R.id.teamBPoint);
        txtTeamBPoint.setText(String.valueOf(point));
    }

    /**
     * Add 1 point to team A
     */
    public void addOnePointForTeamA(View v) {
        teamAPointValues = IncreasePoint(teamAPointValues, 1);
        displayForTeamA(teamAPointValues);
    }

    /**
     * Add 3 points to team A
     */
    public void addThreePointsForTeamA(View view) {
        teamAPointValues = IncreasePoint(teamAPointValues, 3);
        displayForTeamA(teamAPointValues);
    }

    /**
     * Add 4 points to team A
     */
    public void addFourPointsForTeamA(View view) {
        teamAPointValues = IncreasePoint(teamAPointValues, 4);
        displayForTeamA(teamAPointValues);
    }

    /**
     * Add 1 point to team B
     */
    public void addOnePointForTeamB(View view) {
        teamBPointValues = IncreasePoint(teamBPointValues, 1);
        displayForTeamB(teamBPointValues);
    }

    /**
     * Add 3 points to team B
     */
    public void addThreePointsForTeamB(View view) {
        teamBPointValues = IncreasePoint(teamBPointValues, 3);
        displayForTeamB(teamBPointValues);
    }

    /**
     * Add 4 points to team B
     */
    public void addFourPointsForTeamB(View view) {
        teamBPointValues = IncreasePoint(teamBPointValues, 4);
        displayForTeamB(teamBPointValues);
    }

    /**
     * Reset score of team A and team B
     */
    public void resetPoint(View view) {
        teamAPointValues = 0;
        teamBPointValues = 0;
        displayForTeamA(teamAPointValues);
        displayForTeamB(teamAPointValues);
    }
}
