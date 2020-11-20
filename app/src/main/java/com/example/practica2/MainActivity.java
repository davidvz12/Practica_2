package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btEnviar(View view){
        Intent intent = new Intent(this, acSaludo.class);
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText txtfecha = (EditText)findViewById(R.id.txtFecha);
        EditText txttelefono = (EditText)findViewById(R.id.txtTelefono);
        RadioButton rbMasculino = (RadioButton) findViewById(R.id.rbMasculino);
        RadioButton rbFemenino = (RadioButton) findViewById(R.id.rbFemenino);
        String genero = "";
        if(rbMasculino.isChecked())
            genero = rbMasculino.getText().toString();
        else
            genero = rbFemenino.getText().toString();
        Bundle b = new Bundle();
        b.putString("NOMBRE", txtNombre.getText().toString());
        b.putString("FECHA", txtfecha.getText().toString());
        b.putString("TELEFONO", txttelefono.getText().toString());
        b.putString("GENERO",genero);
        intent.putExtras(b);
        startActivity(intent);
    }
}