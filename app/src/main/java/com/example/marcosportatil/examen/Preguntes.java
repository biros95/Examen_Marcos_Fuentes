package com.example.marcosportatil.examen;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by MarcosPortatil on 13/12/2016.
 */

public class Preguntes extends Activity {

    private int preguntes;
    private int tema;
    private int contadorAciertos;
    private int contadorErrores;



    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntes);
        preguntes = getIntent().getIntExtra("preguntas", 10);
        tema = getIntent().getIntExtra("tema", 5);
    }

}
