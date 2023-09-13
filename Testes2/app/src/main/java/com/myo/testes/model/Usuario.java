package com.myo.testes.model;

public class Usuario {

    // Passagem de parâmetro por valor
    public void finalizarCompra(Endereco endereco){

        System.out.println("Antes: " + endereco.rua + ", " + endereco.numero);

        endereco.rua = "Rua Felipe Cardoso";
        endereco.numero = "582";
    }

}
