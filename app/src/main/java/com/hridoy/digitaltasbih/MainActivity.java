package com.hridoy.digitaltasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvCount;
    Button buttonAdd,button2Add,button3Add,button4Add,buttonReset;
    int count=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tvCount = findViewById(R.id.tvCount);
        buttonAdd = findViewById(R.id.buttonAdd);
        button2Add = findViewById(R.id.button2Add);
        button3Add = findViewById(R.id.button3Add);
        button4Add = findViewById(R.id.button4Add);
        buttonReset = findViewById(R.id.buttonReset);

        //=======================================================

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                tvCount.setText(""+count);




            }
        });

        button2Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                tvCount.setText(""+count);


            }
        });

        button3Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                tvCount.setText(""+count);


            }
        });

        button4Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                tvCount.setText(""+count);


            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count = 0;
                tvCount.setText(""+count);


            }
        });

    }
}