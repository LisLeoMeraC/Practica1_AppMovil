package com.example.practica1_appmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nombre, fecha, celular;
    RadioButton mas, fem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnEnviar(View view){

        Intent intent=new Intent(MainActivity.this, MainActivity2.class);
        EditText nombre, fecha, celular;
        RadioButton mas, fem;
        nombre=(EditText) findViewById(R.id.txtNombre);
        fecha=(EditText) findViewById(R.id.txtFecha);
        celular=(EditText) findViewById(R.id.txtTelefono);
        mas=(RadioButton) findViewById(R.id.rMaculino);
        fem=(RadioButton) findViewById(R.id.rFemenino);

        Bundle b= new Bundle();

        b.putString("NOMBRE", nombre.getText().toString());

        if(mas.isChecked()==true){
           b.putString("SEXO", mas.getText().toString());
        }
        if(fem.isChecked()==true){
            b.putString("SEXO", fem.getText().toString());
        }

        b.putString("FECHA", fecha.getText().toString());
        b.putString("CELULAR", celular.getText().toString());
        intent.putExtras(b);
        startActivity(intent);



    }

}