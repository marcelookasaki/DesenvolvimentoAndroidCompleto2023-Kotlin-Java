package com.myo.testes.model;

public class Animal {

    String cor;
    int tamanho;
    int qtdDePatas;
    double peso;

    public Animal() {

    }

    public Animal(String cor, int tamanho, int qtdDePatas, double peso){

        //Validações do que foi passado
        this.cor = cor;
        this.tamanho = tamanho;
        this.qtdDePatas = qtdDePatas;
        this.peso = peso;

    }

    void correr(){

        System.out.println("Correr como um ");

    }

    void dormir(){

        System.out.println("Dormir");

    }

}
