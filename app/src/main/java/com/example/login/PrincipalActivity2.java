package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class PrincipalActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal2);

        Intent intent = getIntent();
        String email = getIntent().getStringExtra("email");
        String senha = getIntent().getStringExtra("senha");

       // Toast.makeText(this,"Login realizado com sucesso = " + email,Toast.LENGTH_LONG).show();

    }
}