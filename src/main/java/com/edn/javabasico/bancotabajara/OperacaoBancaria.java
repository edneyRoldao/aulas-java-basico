package com.edn.javabasico.bancotabajara;

public class OperacaoBancaria {

    void depositar(Conta conta, Double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
    }

    Double sacar(Conta conta, Double valor) {
        if (conta.getSaldo() < valor) {
            System.out.println(conta.getNomeCliente() + " seu saldo e insulficiente");
            System.out.println("valor desejado: " + valor);
            System.out.println("valor em conta: " + conta.getSaldo());
            return conta.getSaldo();
        }

        conta.setSaldo(conta.getSaldo() - valor);

        return conta.getSaldo();
    }

    void transferir(Conta contaSaida, Conta contaEntrada, Double valor) {
        if (contaSaida.getSaldo() < valor) {
            System.out.println(contaSaida.getNomeCliente() + " seu saldo e insulficiente");
            System.out.println("valor desejado: " + valor);
            System.out.println("valor em conta: " + contaSaida.getSaldo());
            return;
        }

        sacar(contaSaida, valor);
        depositar(contaEntrada, valor);
    }

}
