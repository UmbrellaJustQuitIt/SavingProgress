package com.example.savingprogress;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

public class TotalScore extends AppCompatActivity {

    CircularProgressBar circularProgressBar;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.totalscore);

        circularProgressBar = findViewById(circularProgressBar);
        resultText = findViewById(resultText);

    }
}
