package com.example.marcosportatil.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        (findViewById(R.id.button_app)).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Preguntes.class);
                i.putExtra("tema", calcularTema());
                i.putExtra("preguntas", numeroPreguntas());
                startActivity(i);
            }
        });

    }
    private int calcularTema (){
        int tema;
        if (((RadioButton)findViewById(R.id.radio_suma)).isChecked()){
            tema=1;
        }
        else if (((RadioButton)findViewById(R.id.radio_division)).isChecked()){
            tema=2;
        }
        else if (((RadioButton)findViewById(R.id.radio_multiplicacion)).isChecked()){
            tema=3;
        }
        else if (((RadioButton)findViewById(R.id.radio_general)).isChecked()){
            tema=4;
        }
        else {
            tema=5;
        }

        return tema;
    }
    private int numeroPreguntas (){

        if (((RadioButton)findViewById(R.id.radio_10)).isChecked()){
            return 10;
        }
        else if (((RadioButton)findViewById(R.id.radio_20)).isChecked()){
            return 20;
        }

        else {
           return 5;
        }


    }



}



