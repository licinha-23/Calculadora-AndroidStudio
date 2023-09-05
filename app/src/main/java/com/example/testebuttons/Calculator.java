package com.example.testebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        EditText var1 = findViewById(R.id.var1);
        EditText var2 = findViewById(R.id.var2);
        EditText var3 = findViewById(R.id.var3);
        Button btnCalcula = findViewById(R.id.btnCalcula);



    }
}