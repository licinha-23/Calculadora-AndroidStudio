package com.example.testebuttons;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMessage = findViewById(R.id.btnMessage);
        Button btnEscrever = findViewById(R.id.btnEscrever);
        Button btnToast = findViewById(R.id.btnToast);
        Button btnDialogue = findViewById(R.id.btnDialogue);
        TextView txtMessage = findViewById(R.id.txtMessage);
        EditText fldText = findViewById(R.id.fldText);
        TextView msgToast = findViewById(R.id.btnToast);

        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Text = "Bom Dia!";
                txtMessage.setText(Text);
            }
        });

        btnEscrever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String writtentext = fldText.getText().toString().toUpperCase().trim();
                txtMessage.setText(wittentext);
            }
        });

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msgToast = "Boa Noite";
                Toast.makeText(getApplicationContext(), msgToast, Toast.LENGTH_LONG).show();
            }
        });

        btnDialogue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(getApplicationContext());
                dialog.setMessage("Boa Tarde")
                        .setCancelable(false)
                        .setPositiveButton("ola", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "buenas", Toast.LENGTH_LONG).show();
                            }
                        })
                        .setPositiveButton("Ciao", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "Gutten Morgen", Toast.LENGTH_LONG).show();
                            }
                        })
            }
        });

    }
}