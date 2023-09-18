package com.example.calculos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Tela2 extends AppCompatActivity {

    private EditText editText1, editText2, editText3;
    private Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        editText1 = findViewById(R.id.var1);
        editText2 = findViewById(R.id.var2);
        editText3 = findViewById(R.id.var3);
        btnResult = findViewById(R.id.btnResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(editText1.getText().toString());
                int valor2 = Integer.parseInt(editText2.getText().toString());
                int valor3 = Integer.parseInt(editText3.getText().toString());

                int result = valor1 + valor2 + valor3;

                Toast.makeText(Tela2.this, "A soma desses algarismos resulta em:  " + result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
