package com.myo.jankenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view){

        verificarGanhador("pedra");

    }

    public void selecionarPapel(View view){

        verificarGanhador("papel");

    }

    public void selecionarTesoura(View view){

        verificarGanhador("tesoura");

    }

    private String gerarEscolhaApp() {

        String[] opcoes = {"pedra", "papel", "tesoura"};
        int numeroRandom = new Random().nextInt(3);

        ImageView ivApp = findViewById(R.id.ivApp);
        String escolhaApp = opcoes[numeroRandom];
        switch (escolhaApp) {
            case "pedra":
                ivApp.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                ivApp.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                ivApp.setImageResource(R.drawable.tesoura);
                break;

        }

        return escolhaApp;

    }

    private void verificarGanhador(String escolhaUsuario){

        String escolhaApp = gerarEscolhaApp();

        TextView tvResultado = findViewById(R.id.tvResultado);

        if (
            (escolhaApp == "pedra" && escolhaUsuario == "tesoura") ||
            (escolhaApp == "papel" && escolhaUsuario == "pedra") ||
            (escolhaApp == "tesoura" && escolhaUsuario == "papel")
        ){
            tvResultado.setText("App venceu!");
        }else if (
                (escolhaUsuario == "pedra" && escolhaApp == "tesoura") ||
                (escolhaUsuario == "papel" && escolhaApp == "pedra") ||
                (escolhaUsuario == "tesoura" && escolhaApp == "papel")
        ){
            tvResultado.setText("Você venceu!");
        }else { // Empatou
            tvResultado.setText("Empatou!");
        }
    }



}