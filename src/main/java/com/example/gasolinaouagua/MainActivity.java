package com.example.gasolinaouagua;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText inputG;
    private EditText inputA;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCalcular = findViewById(R.id.buttonCalcular);
        inputG = findViewById(R.id.inputG);
        inputA = findViewById(R.id.inputA);
        resultado = findViewById(R.id.resultado);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Double valorAlco = Double.parseDouble(inputA.getText().toString());
                Double valorGaso = Double.parseDouble(inputG.getText().toString());

                double valorF = valorGaso * 0.7;


                if ((valorF < valorAlco)){

                    resultado.setText("A melhor opção para o seu bolso é a Gasolina!");

                } else {
                    resultado.setText("A melhor opção para o seu bolso é o Álcool!");
                }
            }
        });
    }
}