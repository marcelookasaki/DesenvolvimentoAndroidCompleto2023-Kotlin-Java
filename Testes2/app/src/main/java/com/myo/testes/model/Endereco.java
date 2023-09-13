package com.myo.testes.model;

public class Endereco {

    String rua;
    String numero;
    String CEP;

    public Endereco(String rua, String numero, String CEP) {
        this.rua = rua;
        this.numero = numero;
        this.CEP = CEP;
    }

    public Endereco(){}

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
}
