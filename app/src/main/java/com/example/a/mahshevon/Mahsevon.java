package com.example.a.mahshevon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mahsevon extends AppCompatActivity {
    double x, y, ans,ans2;
    EditText display;
    int signal;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahsevon);
        display = (EditText) findViewById(R.id.display);
        x=0;
        y = 0;
        ans = 0;
        s = "";
        display.setText("");
    }

    public void cre(View view) {
        Intent si = new Intent(this, credits.class);
        si.putExtra("cod",ans2);
        startActivity(si);

    }

    public void equ(View view) {
        if(display.getText().toString()==""){
            x=0.0;}
        else {
            y = Double.parseDouble(display.getText().toString());
            if (signal == 1) {
                ans = x / y;
                s = s + ans;
                display.setText(s);
                ans2 = ans;
                s = "";

            } else if (signal == 2) {
                ans = x * y;
                s = s + ans;
                ans2 = ans;
                display.setText(s);
                s = "";

            } else if (signal == 3) {
                ans = x - y;
                s = s + ans;
                ans2 = ans;
                display.setText(s);
                s = "";

            } else {
                ans = x + y;
                s = s + ans;
                ans2 = ans;
                display.setText(s);
                s = "";

            }
        }
    }

    public void res(View view) {

        display.setText("");
        x = 0.0;
        y = 0.0;
        ans = 0.0;
    }

    public void hil(View view) {
        if(display.getText().toString()==""){
            x=0.0;}
        else {
            x = Double.parseDouble(display.getText().toString());
            display.setText("");
        }
        signal= 1;

        }


    public void cef(View view) {
        if(display.getText().toString()==""){
            x=0.0;}
          else {

            x = Double.parseDouble(display.getText().toString());
            display.setText("");
        }
            signal = 2;


    }

    public void min(View view) {
        if(display.getText().toString()==""){
            x=0.0;}
        else {
            x = Double.parseDouble(display.getText().toString());
            display.setText("");
        }
            signal = 3;

    }

    public void plu(View view) {
        if (display.getText().toString() == "") {
            x = 0.0;
        } else {
            x = Double.parseDouble(display.getText().toString());
            display.setText("");
            signal = 4;

        }
    }
}
