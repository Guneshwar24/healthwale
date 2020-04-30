package com.example.healthwalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionActivity extends AppCompatActivity {
    private Button takequiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        takequiz=(Button)findViewById(R.id.takequiz);
        takequiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuestionActivity.this,questionpageActivity.class);
                startActivity(intent);
            }
        });
    }
}
