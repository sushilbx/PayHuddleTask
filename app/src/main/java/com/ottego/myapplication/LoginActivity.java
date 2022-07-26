package com.ottego.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    MaterialButton mbLoginSubmit;

    TextInputEditText tietLoginEmail, tietLoginPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tietLoginEmail = findViewById(R.id.tietLoginEmail);
        tietLoginPassword = findViewById(R.id.tietLoginPassword);
        mbLoginSubmit = findViewById(R.id.mbLoginSubmit);
        mbLoginSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkForm()){
                    Intent intent = new Intent(LoginActivity.this, StudentImageActivity.class);
                    startActivity(intent);
                }


            }
        });


    }

    private boolean checkForm() {
        String mobile = tietLoginEmail.getText().toString().trim();
        String password = tietLoginPassword.getText().toString().trim();

        if (mobile.isEmpty()){
            Toast.makeText(this, "email should not be empty", Toast.LENGTH_SHORT).show();
            return false;
        }else if (!mobile.equals("DemoStudent@gmail.com")){
            Toast.makeText(this, "email is wrong", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (password.isEmpty()){
            Toast.makeText(this, "password should not be empty", Toast.LENGTH_SHORT).show();
            return false;
        }else if (!password.equals("Demo@123")){
            Toast.makeText(this, "password is wrong", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

}