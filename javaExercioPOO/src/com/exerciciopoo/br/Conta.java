package com.exerciciopoo.br;
import java.util.Scanner;
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public Conta() {
    }

    public void abrirConta(String nome, String tipo) {
        this.status = true;
        this.dono = nome;
        this.tipo = tipo;
        if (tipo == "CC") {
            setSaldo(50);
        }
        if (tipo == "CP") {
            setSaldo(150);
        }
    }

    public void fecharConta(){
        setStatus(false);
    }

    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            setSaldo((getSaldo() - valor));
        }
    }

    public void pagarMensal(){
        if (getTipo() == "CC"){
            setSaldo(getSaldo() - 12);
        }
        if(getTipo() == "CP"){
            setSaldo(getSaldo() - 20);
        }
    }


    private String getDono() {
        return this.dono;
    }
    private void setDono(String proprietario) {
        this.dono = proprietario;
    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = Conta.this.numConta;
    }

    private String getTipo() {
        return this.tipo;
    }
    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private double getSaldo() {
        return this.saldo;
    }
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private boolean getStatus(){
        return this.status;
    }
    private void setStatus(boolean status){
        this.status = status;
    }
}