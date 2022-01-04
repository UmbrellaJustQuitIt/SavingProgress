package com.example.savingprogress;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

public class TotalScore extends AppCompatActivity {

    CircularProgressBar circularProgressBar;
    TextView resultText;
    int count0, count1, count2, count3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.totalscore);

        count0.getIntent().getIntExtra("count0", 0);
        count1.getIntent().getIntExtra("count1", 0);
        count2.getIntent().getIntExtra("count2", 0);
        count3.getIntent().getIntExtra("count3", 0);

        circularProgressBar = findViewById(circularProgressBar);
        resultText = findViewById(resultText);

    }
}
