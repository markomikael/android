package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Parcelable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private EditText textbx;
    private ArrayList lista = new ArrayList<String>();
    private TextView teksti;
    private String tiedot;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        this.button1 = findViewById(R.id.button1);
        this.button2 = findViewById(R.id.button2);
        this.textbx = findViewById(R.id.textbx);
        this.teksti = findViewById(R.id.teksti);

        this.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textbx.length() > 3 && textbx.length() < 15) {
                    lista.add(textbx.getText().toString());




                    textbx.setText("");
                }
             else
                Toast.makeText(MainActivity.this, "VIRHEEELLINEN TEKSTI", Toast.LENGTH_SHORT).show();







            }
        });

        this.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putStringArrayListExtra("kissa",lista);
                startActivity(i);


            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }





    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
