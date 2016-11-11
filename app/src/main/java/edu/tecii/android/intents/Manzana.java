package edu.tecii.android.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;  // Se importan ambas últimas librerías para poder realizar el intent.
import android.view.View;  // Se importan ambas últimas librerías para poder realizar el intent.
import android.widget.EditText; // Este nos servirá para mandar un texto sencillo a la otra Actividad.

/**
 * Created by Juan Chacon Holguin on 09/11/2016.
 */

public class Manzana  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manzana);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void onClick(View view){  // El método onClick para brincar al otro Intent.
        Intent i = new Intent(this, Tocino.class);
        final EditText txtMensaje = (EditText) findViewById(R.id.txtMensaje);
        String MensajeUsuario = txtMensaje.getText().toString();
        i.putExtra("MensajeManzana", MensajeUsuario);
        startActivity(i);


    }
}
