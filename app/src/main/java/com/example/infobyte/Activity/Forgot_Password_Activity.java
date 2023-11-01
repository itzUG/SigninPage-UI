package com.example.infobyte.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.infobyte.R;

public class Forgot_Password_Activity extends AppCompatActivity {

    private EditText forgotPasswordUser;
    private Button sendOtp, signInPage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        forgotPasswordUser = findViewById(R.id.forgotpasswprduser);
        sendOtp = findViewById(R.id.sendotp);
        signInPage = findViewById(R.id.signinpage);


        signInPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Forgot_Password_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
