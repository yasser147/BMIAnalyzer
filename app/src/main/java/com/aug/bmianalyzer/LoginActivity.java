package com.aug.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername,etPassword;
    Button btnLogin;
    TextView tvSignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUsername =findViewById(R.id.etUsername);
        etPassword =findViewById(R.id.etPassword);
        btnLogin =findViewById(R.id.btnLogin);
        tvSignup =findViewById(R.id.tvSignup);


    // Button Login  from Login to Main
    btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent loginToMain = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(loginToMain);
            finish();
        }
    });


    // TextView SignUp from Login to Registration
        tvSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginToRegistration = new Intent(LoginActivity.this,RegistrationActivity.class);
                startActivity(loginToRegistration);
                finish();
            }
        });

    }

}