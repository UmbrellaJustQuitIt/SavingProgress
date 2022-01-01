package com.example.savingprogress;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Survey extends AppCompatActivity {

    private Button button2;
    public static ArrayList<Modelclass> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey);

        list = new ArrayList<>();
        list.add(new Modelclass("How soon after waking do you smoke your first cigaratte?", "Within 5 minutes", "5-30 minutes", "31-60 minutes", ">60 minutes", ""));
        list.add(new Modelclass("Do you find it difficult to refrain from smoking in places where it is forbidden? e.g. Library" , "Strongly agree", "Agree", "Disagree", "Strongly Disagree", ""));
        list.add(new Modelclass("Which cigarette would you hate to give up?", "The first in the morning", "After having a meal", "Any other", "I don't know", ""));
        list.add(new Modelclass("How many cigarettes a day do you smoke?", "10 or less", "11-20", "21-30", "31 or more", ""));
        list.add(new Modelclass("Do you smoke more frequently in the morning?", "Yes", "Rarely", "No", "I don't know", ""));
        list.add(new Modelclass("Do you smoke even if you are sick in bed most of tbe day?", "Yes", "Rarely", "No", "I don't know", ""));

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestions();
            }
        });
    }
    public void openQuestions(){
        Intent intent = new Intent(this, Questions.class);
        startActivity(intent);
}
    }