package com.example.savingprogress;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

public class TotalScore extends AppCompatActivity {

    TextView score;
    int correct, wrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.totalscore);

        correct = getIntent().getIntExtra("correct", 0);
        wrong = getIntent().getIntExtra("wrong", 0);

        score = findViewById(R.id.score);

    }
}
