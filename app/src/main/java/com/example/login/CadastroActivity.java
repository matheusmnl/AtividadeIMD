package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {

    private EditText editEmailCadastro;
    private EditText editSenhaCadastro;
    private EditText editNomeCadastro;

    private Button btnCadastrar;

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        preferences = getSharedPreferences("login", MODE_PRIVATE);

        editEmailCadastro = findViewById(R.id.editEmailCadastro);
        editSenhaCadastro = findViewById(R.id.editSenhaCadastro);
        editNomeCadastro = findViewById(R.id.editNomeCadastro);
        btnCadastrar= findViewById(R.id.btnCadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = editNomeCadastro.getText().toString();
                String email = editEmailCadastro.getText().toString();
                String senha = editSenhaCadastro.getText().toString();


                SharedPreferences.Editor editor =preferences.edit();

                editor.putString("nome",nome);
                editor.putString("email", email);
                editor.putString("senha", senha);

                //editor.commit();
                editor.apply();

                Intent intent = new Intent();
                intent.putExtra("email",email);
                intent.putExtra("senha", senha );

                setResult(RESULT_OK, intent);
                finish();

            }
        });
    }
}