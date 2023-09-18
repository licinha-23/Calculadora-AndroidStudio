package com.example.calculos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSoma = findViewById(R.id.btnSoma);
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela2 = new Intent(getApplicationContext(), Tela2.class);
                startActivity(tela2);
            }
        });

        Button btnIMC = findViewById(R.id.btnIMC);
        btnIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela3 = new Intent(getApplicationContext(), Tela3.class);
                startActivity(tela3);
            }
        });
    }
}