package com.edn.javabasico.bancotabajara;

import java.util.Random;

public class Conta {


    private final String tipoConta = "corrente";
    private final String tpConta;

    private Double saldo;
    private Integer numero;
    private String nomeCliente;

    public Conta(String nomeCliente, Double saldo, String tpConta) {
        Random random = new Random();
        this.numero = random.nextInt(1000) + 1;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.tpConta = tpConta;
    }

    public void exibirSaldo() {
        System.out.println(nomeCliente + " seu saldo e:");
        System.out.println(saldo);
    }

    // getters and setters
    public Double getSaldo() {
        return saldo;
    }

    public Conta setSaldo(Double saldo) {
        this.saldo = saldo;
        return this;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Conta setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        return this;
    }

}
