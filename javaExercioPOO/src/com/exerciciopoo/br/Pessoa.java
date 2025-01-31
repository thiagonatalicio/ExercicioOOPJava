package com.exerciciopoo.br;

public class Pessoa{
    private String nome;
    private int cpf;

    private String getNome(){
        return this.nome;
    }
    private void setNome(String nome){
        this.nome = nome;
    }
    private int getCpf(){
        return this.cpf;
    }
    private void setCpf(int cpf){
        this.cpf = cpf;
    }
}