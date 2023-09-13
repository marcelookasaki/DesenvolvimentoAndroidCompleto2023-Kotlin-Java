package com.myo.testes.model;

public class Cachorro extends Animal{

    //Atributos específicos para o cachorro

    //Construtor
    public Cachorro(){}

    public Cachorro(String cor, int tamanho, int qtdDePatas, double peso){
        super(cor, tamanho, qtdDePatas, peso);
    }

    public void latir(){
        System.out.println("Latir");
    }
    public void latir( String pessoa ){
        System.out.println("Latir para " + pessoa );
    }

    // Sobrescrita de método -> Sobreposição
    @Override
    public void correr(){
        super.correr();//Implementação padrão
        System.out.println("cachorro com patas: " + this.qtdDePatas);
    }


}
