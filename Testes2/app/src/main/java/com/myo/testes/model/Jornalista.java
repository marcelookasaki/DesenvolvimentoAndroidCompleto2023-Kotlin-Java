package com.myo.testes.model;

public class Jornalista extends Pessoa implements Candidato{
    @Override
    public void candidatarSe() {
        System.out.println("Jornalista candidatar-se a cargo político.");
    }
}
