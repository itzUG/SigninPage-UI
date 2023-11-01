package com.example.infobyte.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.infobyte.R;

public class Signup_Activity extends AppCompatActivity implements  View.OnClickListener{

    TextView signinpage;
    EditText enteremail , enterpassword , editTextUsername;
    Button signup;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        signinpage = findViewById(R.id.signinpage);
        enteremail = findViewById(R.id.enteremail);
        enterpassword = findViewById(R.id.enterpassword);
        editTextUsername = findViewById(R.id.editTextUsername);
        signup = findViewById(R.id.signup);


        signinpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signup_Activity.this , MainActivity.class);
                startActivity(intent);
            }
        });



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = enteremail.getText().toString().trim();
                String password = enterpassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Please enter email...", Toast.LENGTH_LONG).show();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Please enter password!", Toast.LENGTH_LONG).show();
                    return;
                }

            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}

