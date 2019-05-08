package com.calculadorabasica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtA = findViewById(R.id.txtA);
        final TextView txtB = findViewById(R.id.txtB);
        final Button btnSumar = findViewById(R.id.btnSumar);
        final Button btnRestar = findViewById(R.id.btnRestar);
        final Button btnMultpilicar = findViewById(R.id.btnMultiplicar);
        final Button btnDividir = findViewById(R.id.btnDividir);
        final Button btnPorcentaje = findViewById(R.id.btnPorcentaje);
        final Button btnPotencia = findViewById(R.id.btnPotencia);


        final TextView txtResult = findViewById(R.id.txtResult);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(txtA.getText().toString());
                double b = Double.parseDouble(txtB.getText().toString());
                double suma = a+b;
                txtResult.setText(""+suma);
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(txtA.getText().toString());
                double b = Double.parseDouble(txtB.getText().toString());
                double resta = a-b;
                txtResult.setText(""+resta);
            }
        });

        btnMultpilicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(txtA.getText().toString());
                double b = Double.parseDouble(txtB.getText().toString());
                double multiplicar = a*b;
                txtResult.setText(""+multiplicar);
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(txtA.getText().toString());
                double b = Double.parseDouble(txtB.getText().toString());
                double dividir = a/b;
                txtResult.setText(""+dividir);
            }
        });

        btnPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(txtA.getText().toString());
                double b = Double.parseDouble(txtB.getText().toString());
                double porcentaje = a%b;
                txtResult.setText(""+porcentaje);
            }
        });

        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(txtA.getText().toString());
                double b = Double.parseDouble(txtB.getText().toString());
                double potencia = Math.pow(a,b);
                txtResult.setText(""+potencia);
            }
        });


    }
}
