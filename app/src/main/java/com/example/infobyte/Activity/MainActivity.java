package com.example.infobyte.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.infobyte.R;

public class MainActivity extends AppCompatActivity {

    private TextView signuppage, forgotpwd;
    private EditText editTextUseremail, userpassword;
    private Button logincontinue;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signuppage = findViewById(R.id.signuppage);
        forgotpwd = findViewById(R.id.forgotpwd);
        editTextUseremail = findViewById(R.id.editTextUseremail);
        logincontinue = findViewById(R.id.logincontinue);
        userpassword = findViewById(R.id.userpassword);




        signuppage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Signup_Activity.class);
                startActivity(intent);

            }
        });

        forgotpwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Forgot_Password_Activity.class);
                startActivity(intent);
            }
        });

        logincontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UI_Main_Page.class);
                startActivity(intent);
            }
        });

    }

//    private void loginUserAccount() {
//
//        String email, password;
//        email = editTextUseremail.getText().toString().trim();
//        password = userpassword.getText().toString().trim();
//
//        if (TextUtils.isEmpty(email)) {
//            Toast.makeText(getApplicationContext(), "Please enter email...", Toast.LENGTH_LONG).show();
//            return;
//        }
//        if (TextUtils.isEmpty(password)) {
//            Toast.makeText(getApplicationContext(), "Please enter password!", Toast.LENGTH_LONG).show();
//            return;
//        }
//        else
//        {
//            Intent intent = new Intent(MainActivity.this,UI_Main_Page.class);
//            startActivity(intent);
//        }
//
//    }
}