package com.myo.testes.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myo.testes.R
import com.myo.testes.model.Cachorro

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Cachorro cachorro = new Cachorro(
            "Marrom", 8, 4, 1.5
        );

        cachorro.correr();


        //cachorro.latir();
        //cachorro.latir("Jamilton");
        /*cachorro.quantidadePatas = 4;
        cachorro.correr();*/

        /*System.out.println("----------");

        Passaro passaro = new Passaro();
        passaro.quantidadePatas = 2;
        passaro.correr();*/

        /*cachorro.dormir();
        cachorro.latir();*/

        /*System.out.println("----------");

        Passaro passaro = new Passaro();
        passaro.cor = "Azul";
        passaro.correr();
        passaro.dormir();
        passaro.voar();*/


    }
}