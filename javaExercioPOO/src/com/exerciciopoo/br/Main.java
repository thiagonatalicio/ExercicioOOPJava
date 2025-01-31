package com.exerciciopoo.br;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.extrato();
        conta.deposito(5.78);
        conta.extrato();
        conta.sacar(10);
        conta.extrato();
        conta.deposito(3.45);
        conta.extrato();
        conta.sacar(7);
        conta.extrato();
    }
}