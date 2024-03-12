package com.example.miprimerapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText id,nombre,valor,marca,Iva,Bruto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    id=(EditText) findViewById(R.id.txtId);
    nombre=(EditText) findViewById(R.id.txtNombre);
    valor=(EditText) findViewById(R.id.txtValor);
    marca=(EditText) findViewById(R.id.txtMarca);
    Iva=(EditText) findViewById(R.id.txtIva);
    Bruto=(EditText) findViewById(R.id.txtBruto);

    }
    public void Calculo(View view) {
        double v= Double.parseDouble(valor.getText().toString());

        double resultadoIva=v*0.19;
        double resultadoBruto=v*1.19;

        Iva.setText(String.valueOf("Iva:"+(resultadoIva)));
        Bruto.setText(String.valueOf("Valor Bruto:"+(resultadoBruto)));

    }
}