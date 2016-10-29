package com.example.josehernandezuribe.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FinalSignup extends AppCompatActivity {

    TextView p1, p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_signup);

        p1 = (TextView)findViewById(R.id.p1);
        p2 = (TextView)findViewById(R.id.p2);

        Intent i = getIntent();
        p1.setText(i.getStringExtra("name"));
        p2.setText(i.getStringExtra("Email"));

    }
}