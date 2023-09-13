package com.myo.testes.model;

public class Passaro extends Animal{

    public Passaro(String cor, int tamanho, int qtdPatas, double peso){
        //Fazer alguma validação
        super(cor, tamanho, qtdPatas, peso);
        //Fazer mais alguma coisa
    }

    void voar(){
        System.out.println("Voar");
    }

    @Override
    void correr(){
        super.correr();
        System.out.println("passaro utilizando as assas e com patas: " + this.qtdDePatas);
    }

}
