package com.example.savingprogress;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

public class TotalScore extends AppCompatActivity {

    CircularProgressBar circularProgressBar;
    TextView score;
    TextView resultText;
    int count0, count1, count2, count3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.totalscore);

        circularProgressBar = findViewById(R.id.circularProgressBar);
        score = findViewById(R.id.score);
        resultText = findViewById(R.id.resultText);

        switch(score)
        {
            case 0: t.setText("Low Dependence");
            break;

            case 1: t.setText("Low to Mod Dependence");
            break;

            case 2: t.setText("Moderate Dependence");
            break;

            case 3: t.setText("High Dependence");
            break;
        }

    }
}
