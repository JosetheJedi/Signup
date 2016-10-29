package com.example.josehernandezuribe.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup1 extends AppCompatActivity
{

    EditText f1, f2, f3, f4;
    Button f5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup1);

        f1 = (EditText)findViewById(R.id.f1);
        f2 = (EditText)findViewById(R.id.f2);
        f3 = (EditText)findViewById(R.id.f3);
        f4 = (EditText)findViewById(R.id.f4);
        f5 = (Button)findViewById(R.id.f5);

        f5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String pass1, pass2, email, name;
                name = f1.getText().toString();
                email = f2.getText().toString();
                pass1 = f3.getText().toString();
                pass2 = f4.getText().toString();

                // check if f3 and f4 are equal
                if (pass1.equals(pass2))
                {
                    // if f3 and f4 are equal then
                    // it will go to the next activity
                    Intent i = new Intent(Signup1.this, FinalSignup.class);

                    // we are passing the value for name and email
                    // to the next activity to display it.
                    i.putExtra("name", name);
                    i.putExtra("Email", email);
                    startActivity(i);
                }
                else
                {
                    // Report that the passwords do not match
                    f3.setError("Passwords do not match");
                }

            }
        });

    }
}
