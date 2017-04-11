package com.example.stanislavm.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int catA = 0;
    int catB = 0;
    int resetScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayCatAScore(catA);
        displayCatBScore(catB);
    }

    /**
     * Display score for CatA
     */
    public void displayCatAScore(int catA) {
        TextView scoreView = (TextView) findViewById(R.id.catA);
        scoreView.setText(String.valueOf(catA));
    }

    /**
     * Plus point for cat A
     */
    public void plusPointForCatA(View view) {
        if (catA > 9) {
            Toast.makeText(this, "Viki wins!!!", Toast.LENGTH_SHORT).show();
            return;
        }

        catA = catA + 1;
        displayCatAScore(catA);
    }

    /**
     * Lost point for cat A
     */
    public void minusPointForCatA(View view) {
        if (catA < 0) {
            Toast.makeText(this, "Cernovous wins!!!", Toast.LENGTH_SHORT).show();
            return;
        }
        catA = catA - 1;
        displayCatAScore(catA);
    }
    /**
     * Same for cat B
     */
    public void displayCatBScore(int catB) {
        TextView scoreView = (TextView) findViewById(R.id.catB);
        scoreView.setText(String.valueOf(catB));
    }

    public void plusPointForCatB(View view) {
        if (catB > 9) {
            Toast.makeText(this, "Cernovous wins!!!", Toast.LENGTH_SHORT).show();
            return;
        }
        catB = catB + 1;
        displayCatBScore(catB);
    }

    public void minusPointForCatB(View view) {
            if (catB < 0) {
                Toast.makeText(this, "Viki wins!!!", Toast.LENGTH_SHORT).show();
                return;
            }
        catB = catB - 1;
        displayCatBScore(catB);
    }

    /**
     * Resets score
     */
    public void resetScore(View view) {
        catA = resetScore;
        displayCatAScore(resetScore);
        catB = resetScore;
        displayCatBScore(resetScore);
    }
}
