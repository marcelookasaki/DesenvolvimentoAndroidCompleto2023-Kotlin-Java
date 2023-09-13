package com.myo.testes.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.myo.testes.R;
import com.myo.testes.model.Cachorro;
import com.myo.testes.model.DevMobile;
import com.myo.testes.model.DevWeb;
import com.myo.testes.model.Endereco;
import com.myo.testes.model.Jornalista;
import com.myo.testes.model.Passaro;
import com.myo.testes.model.Usuario;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cachorro cachorro = new Cachorro("Marrom", 8, 4, 1.5);
        cachorro.correr();

        Passaro passaro = new Passaro("Azul", 2, 2, 0.5);
        passaro.correr();

        DevMobile devMobile = new DevMobile();

        devMobile.programar();
        devMobile.candidatarSe();

        DevWeb devWeb = new DevWeb();
        //devWeb.candidatarSe();

        Jornalista jornalista = new Jornalista();
        jornalista.candidatarSe();


        // String endereco = "Rua Felipe Cardoso, 582";
        Usuario usuario = new Usuario();

        Endereco endereco = new Endereco();
        endereco.setRua("Rua Luis Sergio Guerreiro");
        endereco.setNumero("172");
        endereco.setCEP("04152-110");

        usuario.finalizarCompra(endereco);

        System.out.println("Depois: " + endereco.getRua() + ", " + endereco.getNumero());





    }
}