package com.myo.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] frases = {
            "A vida é bela, basta sorrir para ela!",
            "Disciplina é liberdade!",
            "Ter bondade é ter coragem!",
            "Compaixão é fortaleza!"
    };

    TextView tvFrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFrase = findViewById(R.id.tvResultado);
    }

    public void gerarFrase(View view){

        int num = new Random().nextInt(3);

        tvFrase.setText(frases[num]);

    }

    public void exibirTodas(View view){

        String string = "";

        for(String frase : frases){

            // Saída na sysout
            /*System.out.println(frase);*/

            // Saída na tv da tela

            string = string + "\n  " +frase;
            tvFrase.setText(string);

        }

    }

}