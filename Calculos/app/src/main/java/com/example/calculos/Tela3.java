package com.example.calculos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela3 extends AppCompatActivity {

    private EditText editTextNome, editTextIdade, editTextAltura, editTextPeso;
    private Button btnResult2;
    private String situacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        editTextNome = findViewById(R.id.varNome);
        editTextIdade = findViewById(R.id.varIdade);
        editTextAltura = findViewById(R.id.varAltura);
        editTextPeso = findViewById(R.id.varPeso);

        btnResult2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nome = editTextNome.getText().toString();
                int Idade = Integer.parseInt(editTextIdade.getText().toString());
                int Altura = Integer.parseInt(editTextAltura.getText().toString());
                int Peso = Integer.parseInt(editTextPeso.getText().toString());

                int result = Peso / (Altura * Altura);

                if (result < 17){
                    String situacao = "Extremamente abaixo do peso";
                }else if (result >= 17 && result < 18.5){
                    String situacao = "Abaixo do peso";
                }else if (result >= 18.5 && result <25){
                    String situacao = "Peso normal";
                }else if (result >= 25 && result < 30){
                    String situacao = "Acima do peso";
                }else if (result >= 30 && result <35){
                    String situacao = "Obesidade I";
                }else if (result >= 35 && result < 40){
                    String situacao = "Obesidade II";
                }else {
                    String situacao = "Obesidade mórbida";
                }


                Toast.makeText(Tela3.this, "Nome: " + Nome + " Idade: " + Idade + " IMC: " + result + " Situação: " + situacao, Toast.LENGTH_SHORT).show();

            }
        });
    }
}