package com.aug.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    EditText etName, etPassword, etEmail, etRePassword;
    Button btnCreate;
    TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        etName = findViewById(R.id.etName);
        etPassword = findViewById(R.id.etPassword);
        etEmail = findViewById(R.id.etEmail);
        etRePassword = findViewById(R.id.etRePassword);

        btnCreate = findViewById(R.id.btnCreate);
        tvLogin = findViewById(R.id.tvLogin);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent registrationToLogin = new Intent(RegistrationActivity.this,LoginActivity.class);
            startActivity(registrationToLogin);
            finish();
            }

        });



    }
}