package com.example.calculos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela5 extends AppCompatActivity {

    private EditText editTextName, editTextSobrenome;
    private Button btnNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);

        editTextName = findViewById(R.id.Nome);
        editTextSobrenome = findViewById(R.id.Sobrenome);

        Button btnNome = findViewById(R.id.btnNome);
        btnNome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela5.this, Tela5a.class);

                intent.putExtra("nome", editTextName.getText().toString());
                intent.putExtra("sobrenome", editTextSobrenome.getText().toString());

                startActivity(intent);
                finish();
            }
        });

    }
}