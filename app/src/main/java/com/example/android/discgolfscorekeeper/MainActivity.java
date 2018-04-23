package com.example.android.discgolfscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    int scorePlayerA = 0;
    int scorePlayerB = 0;
    int playerA_penalty = 0;
    int playerB_penalty = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        displayForPlayerA (0);
        displayForPlayerB (0);
        displayPenaltyPlayerA (0);
        displayPenaltyPlayerB(0);
    }
    /**
     * Displays the score for Player A
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.playerOne_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * adds one point for Player A
     */
    public void onePointA (View v) {
        scorePlayerA = scorePlayerA + 1;
        displayForPlayerA(scorePlayerA+playerA_penalty);
    }
        /**
         * adds two points for Player A
         */
    public void twoPointA (View v) {
        scorePlayerA = scorePlayerA + 2;
        displayForPlayerA(scorePlayerA+playerA_penalty);
    }
        /**
         * adds three points for Player A
         */
    public void threePointA (View v) {
        scorePlayerA = scorePlayerA + 3;
        displayForPlayerA(scorePlayerA+playerA_penalty);
    }
        /**
         * Adds penalty throw to score.
         */
    public void displayPenaltyPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.playerA_penalty);
        scoreView.setText(String.valueOf(score));
    }
    public void penalty_playerA(View v) {
        playerA_penalty = playerA_penalty + 1;
        displayPenaltyPlayerA(playerA_penalty);
        displayForPlayerA(playerA_penalty+scorePlayerA);
    }

    /**
     * Displays the score for Player B
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.playerTwo_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * adds one point for Player B
     */
    public void onePointB (View v) {
        scorePlayerB = scorePlayerB + 1;
        displayForPlayerB(scorePlayerB+playerB_penalty);
    }
        /**
         * adds two points for Player B
         */
    public void twoPointB (View v) {
        scorePlayerB = scorePlayerB + 2;
        displayForPlayerB(scorePlayerB+playerB_penalty);
    }
        /**
         * adds three points for Player B
         */
    public void threePointB (View v) {
        scorePlayerB = scorePlayerB + 3;
        displayForPlayerB(scorePlayerB+playerB_penalty);
    }
    /**
     * Adds penalty throw to score.
     */
    public void displayPenaltyPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.playerB_penalty);
        scoreView.setText(String.valueOf(score));
    }
    public void penalty_playerB(View v) {
        playerB_penalty = playerB_penalty + 1;
        displayPenaltyPlayerB(playerB_penalty);
        displayForPlayerB(playerB_penalty+scorePlayerB);
    }


        /**
         * Clear score
         */
        public void clearScore (View v) {
            scorePlayerA = 0;
            scorePlayerB = 0;
            playerA_penalty = 0;
            playerB_penalty = 0;
            displayForPlayerA(0);
            displayForPlayerB(0);
            displayPenaltyPlayerA(0);
            displayPenaltyPlayerB(0);
        }
}
