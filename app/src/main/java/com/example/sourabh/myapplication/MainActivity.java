package com.example.sourabh.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton t;
    private Button b;
    private LinearLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = (ToggleButton)findViewById(R.id.toggle);
        b = (Button)findViewById(R.id.button);
        l = (LinearLayout)findViewById(R.id.linear);



    }

    public void clickedToggle(View v)  //When toggleButton clicked
    {
        if(t.getText().toString().equals("Sun Mode")){   //Comparing strings
            l.setBackgroundColor(Color.BLUE);
            t.setBackgroundColor(Color.WHITE);
            t.setTextColor(Color.YELLOW);

        }
        else {
            l.setBackgroundColor(Color.BLACK);
            t.setBackgroundColor(Color.GRAY);
            t.setTextColor(Color.WHITE);
        }
    }


    public void pressed(View v)   //When "Wish Me" button clicked
    {
        if(t.getText().toString().equals("Sun Mode")){
        Toast.makeText(MainActivity.this,"Good Morning " + t.getText().toString(),Toast.LENGTH_LONG).show();

        }
        else {
            Toast.makeText(MainActivity.this,"Good Night " + t.getText().toString(),Toast.LENGTH_LONG).show();
        }
    }
}
