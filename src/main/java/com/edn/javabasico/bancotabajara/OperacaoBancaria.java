package com.edn.javabasico.bancotabajara;

public class OperacaoBancaria {

    void depositar(Conta conta, Double valor) {
        conta.saldo = conta.saldo + valor;
    }

    Double sacar(Conta conta, Double valor) {
        if (conta.saldo < valor) {
            System.out.println(conta.nomeCliente + " seu saldo e insulficiente");
            System.out.println("valor desejado: " + valor);
            System.out.println("valor em conta: " + conta.saldo);
            return conta.saldo;
        }

        conta.saldo = conta.saldo - valor;

        return conta.saldo;
    }

    void transferir(Conta contaSaida, Conta contaEntrada, Double valor) {
        if (contaSaida.saldo < valor) {
            System.out.println(contaSaida.nomeCliente + " seu saldo e insulficiente");
            System.out.println("valor desejado: " + valor);
            System.out.println("valor em conta: " + contaSaida.saldo);
            return;
        }

        sacar(contaSaida, valor);
        depositar(contaEntrada, valor);
    }

}
