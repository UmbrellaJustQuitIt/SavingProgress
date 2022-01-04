package com.example.savingprogress;

import static com.example.savingprogress.Survey.list;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.Collections;
import java.util.List;

public class Questions extends AppCompatActivity {

    List<Modelclass> allQuestionsList;
    Modelclass modelclass;
    int index = 0;
    TextView card_question, optiona, optionb, optionc, optiond;
    CardView cardOA, cardOB, cardOC, cardOD;
    int count0 = 0;
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);

        Hooks();

        allQuestionsList = list;
        Collections.shuffle(allQuestionsList);
        modelclass = list.get(index);

        setAllData();
    }

    private void setAllData() {

        card_question.setText(modelclass.getQuestion());
        optiona.setText(modelclass.getoA());
        optionb.setText(modelclass.getoB());
        optionc.setText(modelclass.getoC());
        optiond.setText(modelclass.getoD());

    }

    private void Hooks() {

        card_question = findViewById(R.id.card_question);
        optiona = findViewById(R.id.card_optiona);
        optionb = findViewById(R.id.card_optionb);
        optionc = findViewById(R.id.card_optionc);
        optiond = findViewById(R.id.card_optiond);

        cardOA = findViewById(R.id.cardA);
        cardOB = findViewById(R.id.cardB);
        cardOC = findViewById(R.id.cardC);
        cardOD = findViewById(R.id.cardD);

    }
    public void Count0() {
        count0++;
        index++;
        modelclass = list.get(index);
        setAllData();
    }

    public void Count1() {
        count1++;
        index++;
        modelclass = list.get(index);
        setAllData();
    }

    public void Count2() {
        count2++;
        if(index > list.size() + 2) {
            index++;
            modelclass = list.get(index);
            setAllData();
        }
        else{
            TotalScore();
        }
    }

    public void Count3() {
        count3++;
        if(index > list.size() + 3) {
            index++;
            modelclass = list.get(index);
            setAllData();
        }
        else{
            TotalScore();
        }
    }

    private void TotalScore() {
        Intent intent = new Intent(Questions.this, TotalScore.class);
        intent.putExtra("count1", count1);
        intent.putExtra("count2", count2);
        intent.putExtra("count3", count3);
        startActivity(intent);
    }

    public void enableButton() {
        cardOA.setClickable(true);
        cardOB.setClickable(true);
        cardOC.setClickable(true);
        cardOD.setClickable(true);
    }

    public void disableButton() {
        cardOA.setClickable(false);
        cardOB.setClickable(false);
        cardOC.setClickable(false);
        cardOD.setClickable(false);
    }
}
