package com.example.practica1_appmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView saludo;
        saludo= (TextView)findViewById(R.id.lblsaludo);
        Bundle bundle=this.getIntent().getExtras();

        saludo.setText("Estimado/a, " +bundle.getString("NOMBRE")+"\nLa información ingresada" +
                " en el formulario, nos dice que ud ha nacido el "+bundle.getString("FECHA")+" de " +
                "sexo "+bundle.getString("SEXO") +", cuyo numero de celular es: "+bundle.getString("CELULAR"));
    }
}