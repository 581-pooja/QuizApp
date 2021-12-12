package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {"Java was developed by James Gosling in 1995?",
                                    "Java supports Object Oriented Programming?",
                                    "Object is Logical Entity?",
                                    "Class is BluePrint of Object?",
                                    "Java has abstract classes?",
                                    "Java is hybrid Language?",
                                    "Java has Ploymorphism?"};
    private boolean[] answers = {true,true,false,true,true,false,true};
    private int score = 0;
    private int index = 0;
    private TextView questiontxt;
    Button yes;
    Button no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        questiontxt = findViewById(R.id.questiontxt);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // If the array is not going out of bounds
                if(index <= questions.length-1){
                    // If you have given correct answer
                    if(answers[index] == true){
                        score++;
                    }
                    index++;
                    if(index <= questions.length-1){
                        questiontxt.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Score is : " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart Quiz App to play Again", Toast.LENGTH_SHORT).show();
                }

            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // If the array is not going out of bounds
                if(index <= questions.length-1){
                    // If you have given correct answer
                    if(answers[index] == false){
                        score++;
                    }
                    index++;
                    if(index <= questions.length-1){
                        questiontxt.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Score is : " + score+ "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart Quiz App to play Again", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}