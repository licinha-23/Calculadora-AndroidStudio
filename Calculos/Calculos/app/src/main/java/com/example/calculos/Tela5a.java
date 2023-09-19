package com.example.calculos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela5a extends AppCompatActivity {

    TextView nome_completo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5a);

        nome_completo = findViewById(R.id.nome_completo);

        String nome = getIntent().getStringExtra("nome");
        String sobrenome = getIntent().getStringExtra("sobrenome");
        nome_completo.setText(nome + " " + sobrenome);

    }
}