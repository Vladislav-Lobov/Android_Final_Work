package com.example.my_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    Button button01, button02, button03, button04, button05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        button01 = (Button) findViewById(R.id.button01);
        button02 = (Button) findViewById(R.id.button02);
        button03 = (Button) findViewById(R.id.button03);
        button04 = (Button) findViewById(R.id.button04);
        button05 = (Button) findViewById(R.id.button05);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "ФУНКЦИОНАЛ <<ИГРОК>> РАЗРАБАТЫВАЕТСЯ", Toast.LENGTH_LONG).show();
            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "ФУНКЦИОНАЛ <<ТРЕНЕР>> РАЗРАБАТЫВАЕТСЯ", Toast.LENGTH_LONG).show();
            }
        });

        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "ФУНКЦИОНАЛ <<МАГАЗИН>> РАЗРАБАТЫВАЕТСЯ", Toast.LENGTH_LONG).show();
            }
        });

        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "ФУНКЦИОНАЛ <<СПОРТИВНАЯ ПЛОЩАДКА>> РАЗРАБАТЫВАЕТСЯ", Toast.LENGTH_LONG).show();
            }
        });

        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "ФУНКЦИОНАЛ <<ОРГАНИЗАТОР ТУРНИРОВ>> РАЗРАБАТЫВАЕТСЯ", Toast.LENGTH_LONG).show();
            }
        });


    }


}