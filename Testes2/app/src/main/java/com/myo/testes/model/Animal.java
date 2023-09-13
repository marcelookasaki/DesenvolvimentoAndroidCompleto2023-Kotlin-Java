package com.myo.testes.model;

abstract class Animal {

    String cor;
    int tamanho;
    int qtdDePatas;
    double peso;

    public Animal(){}

    public Animal(String cor, int tamanho, int qtdDePatas, double peso){
        //Validações do que foi passado
        this.cor = cor;
        this.tamanho = tamanho;
        this.qtdDePatas = qtdDePatas;
        this.peso = peso;
    }

    void correr(){
        System.out.println("Correr como um ");//20 linhas de código
    }

    void dormir(){
        System.out.println("Dormir");
    }


}
