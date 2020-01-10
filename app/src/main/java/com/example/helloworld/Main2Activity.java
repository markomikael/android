package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private TextView teksti2;
    private Button button3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        this.teksti2 = findViewById(R.id.teksti2);
        this.button3 = findViewById(R.id.button3);
        if (intent != null) {

            ArrayList<String> array = intent.getStringArrayListExtra("kissa");

            if (array.size() != 0)
            teksti2.setText(array.toString());

            else
                teksti2.setText("tyhjataulu");


        }

        this.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i  = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(i);
            }
        });




















    }
}
