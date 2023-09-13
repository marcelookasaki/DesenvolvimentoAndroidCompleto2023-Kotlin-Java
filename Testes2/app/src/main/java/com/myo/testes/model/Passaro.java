package com.myo.testes.model;

public class Passaro extends Animal{

    public Passaro(){}


    public Passaro(String cor, int tamanho, int qtdDePatas, double peso ) {
        super(cor, tamanho, qtdDePatas, peso);

    }

    public void voar(){
        System.out.println("voar");
    }

    @Override
    public void correr(){
        super.correr();
        System.out.println("passaro utilizando as asas e com patas: " + this.qtdDePatas);
    }

}
