package com.exerciciopoo.br;
import java.util.Scanner;
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

    class Builder{
        private String propietario;
        private int numero;
        private int cpfPropietario;
        private String tipo;
        private double saldo;
        private int senha;
    }
    public Builder cadastrarConta(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriando nova conta.");
        System.out.println("Digite seu nome:");
        System.out.print("=[>");
        String nome = scanner.nextLine();
        System.out.println("\nDigite seu CPF:");
        System.out.print("=[>");
        int cpfPropietario = scanner.nextInt();
        System.out.println("\nDigite 1 para conta poupança e 2 para corrente:");
        System.out.print("=[>");
        String tipo;
        int escolha = 0;
        do{
            escolha = scanner.nextInt();
            if(escolha == 1){
                tipo = "Poupança";
            }
            if(escolha == 2){
                tipo = "Corrente";
            }
        }while(escolha != 1 && escolha != 2);
        int senha;
        do{
            System.out.println("\nCrie uma senha de no maximo 6 digitos:");
            System.out.print("=[>");
            senha = scanner.nextInt();
        }while(senha > 0 && senha < 999999);
        Builder conta = new Builder();
        return conta;
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