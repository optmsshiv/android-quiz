package com.example.x360.androidquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class quiz extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }
    public void submit(View view)
    {
        EditText nam = (EditText) findViewById(R.id.add_nam);
        TextView scoreView = (TextView) findViewById(R.id.score_text_view);
        RadioButton one = (RadioButton) findViewById(R.id.add_one);
        RadioButton two = (RadioButton) findViewById(R.id.add_two);
        RadioButton three = (RadioButton) findViewById(R.id.add_three);
        RadioButton four = (RadioButton) findViewById(R.id.add_four);
        RadioButton five = (RadioButton) findViewById(R.id.add_five);
        RadioButton six = (RadioButton) findViewById(R.id.add_six);
        CheckBox seven = (CheckBox) findViewById(R.id.add_seven);
        CheckBox eight = (CheckBox) findViewById(R.id.add_eight);
        String value = nam.getText().toString();

        boolean answer[] = {one.isChecked(), two.isChecked(), three.isChecked(), four.isChecked(), five.isChecked(), six.isChecked()};
        for (int i = 0; i < 6; i++) {
            if (answer[i])
                score++;
        }
        if (seven.isChecked() && eight.isChecked())
            score++;

        scoreView.setText("Congratulations  " + value + " You have scored " + Integer.toString(score) + "/7");

    }

}
