package com.myo.testes.model;

public class DevMobile extends Pessoa implements Candidato{

    public void programar(){}

    @Override
    public void candidatarSe() {
        System.out.println("DevMobile candidatar-se a cargo político.");
    }
}
