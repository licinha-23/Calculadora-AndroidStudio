package com.example.calculos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela4 extends AppCompatActivity {

    private EditText editTextA, editTextB, editTextC;
    private Button btnResult3;
    private int Delta;
    private float sqrtdelta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        editTextA = findViewById(R.id.varA);
        editTextB = findViewById(R.id.varB);
        editTextC = findViewById(R.id.varC);

        btnResult3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A = Integer.parseInt(editTextA.getText().toString());
                int B = Integer.parseInt(editTextB.getText().toString());
                int C = Integer.parseInt(editTextC.getText().toString());

                int Delta = (B * B) - 4 * A * C;
                sqrtdelta = (float)Math.sqrt(Delta);

                float result = ((-1) * B + sqrtdelta)/(2 * A);

                Toast.makeText(Tela4.this, (int) result, Toast.LENGTH_SHORT).show();

            }
        });
    }
}