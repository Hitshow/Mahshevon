package com.example.a.mahshevon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class credits extends AppCompatActivity {
    TextView tv;
    String s ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits2);
        Intent gi = getIntent();
        double last = gi.getDoubleExtra("cod",0);
       tv =(TextView) findViewById(R.id.tv);
        s = ""+last;
        tv.setText("the last ans was:"+s);
    }

}
