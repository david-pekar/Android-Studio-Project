package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class signUp extends AppCompatActivity {

    private Button btnBack;
    private TextInputEditText textInputEditTextFullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnBack = (Button) findViewById(R.id.btnBack);
        textInputEditTextFullName = (TextInputEditText) findViewById(R.id.textInputEditTextFullName);
        Button btnNext = (Button) findViewById(R.id.btnNext);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), login_page.class);
                startActivity(intent);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = textInputEditTextFullName.getText().toString();
                Intent intent = new Intent(getApplicationContext(), signUpPass.class);
                intent.putExtra("Name", value);
                startActivity(intent);
            }
        });




    }
}