package com.exerciciopoo.br;

public class Conta {
    private String propietario;
    private int numero;
    private int cpfPropietario;
    private String tipo;
    private double saldo;
    private int senha;

    public Conta(){
        this.saldo = 0;
    }

    public void sacar(double valor){
        if(getSaldo() >= valor){
            setSaldo((getSaldo() - valor));
        }
    }

    public void extrato(){
        System.out.println(this.saldo);
    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    private String getPropietario(){
        return this.propietario;
    }
    private void setPropietario(String proprietario){
        this.propietario = proprietario;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    private int getCpfPropietario(){
        return this.cpfPropietario;
    }
    private void setCpfProprietario(int cpfPropietario){
        this.cpfPropietario = cpfPropietario;
    }

    private String getTipo(){
        return this.tipo;
    }
    private void setTipo(String tipo){
        this.tipo = tipo;
    }

    private double getSaldo(){
        return this.saldo;
    }
    private void setSaldo(double saldo){
        this.saldo = saldo;
    }

    private int getSenha(){
        return this.senha;
    }
    private void setSenha(int senha){
        this.senha = senha;
    }



}