package com.myo.testes.model;

public class Cachorro extends Animal{


    public Cachorro(){}

    public Cachorro(String cor, int tamanho, int qtdDePatas, double peso){
        super(cor, tamanho, qtdDePatas, peso);
    }

    void latir(){

        System.out.println("Latir");

    }
    // Sobrescrita de método -> Sobreposição
    @Override
    void correr() {
        super.correr();

        System.out.println(" cachorro com patas:  "+ this.qtdDePatas);
    }
}
