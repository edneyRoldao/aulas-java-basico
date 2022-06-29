package com.edn.javabasico.bancotabajara;

public class Conta {

    Integer numero;
    String nomeCliente;
    Double saldo;

    void exibirSaldo() {
        System.out.println(nomeCliente + " seu saldo e:");
        System.out.println(saldo);
    }

}
