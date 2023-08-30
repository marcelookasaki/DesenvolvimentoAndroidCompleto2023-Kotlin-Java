package com.myo.appsorteio

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    @SuppressLint("SetTextI18n")
    fun sortear(view: View){

        val numSorteado = findViewById<TextView>(R.id.tvNum)

        val num = java.util.Random().nextInt(11)

        numSorteado.setText("Número sorteado: "+ num)

    }

}