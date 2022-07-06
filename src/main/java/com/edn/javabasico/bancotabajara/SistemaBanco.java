package com.edn.javabasico.bancotabajara;

public class SistemaBanco {

    public static void main(String[] args) {
        OperacaoBancaria operacaoBancaria = new OperacaoBancaria();

        // edney acessando a conta
        Conta contaEdy = new Conta( "Edney Roldao", 5000.00, "corrente");

        contaEdy.exibirSaldo();

        // fazendo um deposito na conta do edney
        operacaoBancaria.depositar(contaEdy, 5000.00);

        contaEdy.exibirSaldo();

        operacaoBancaria.sacar(contaEdy, 20000.00);

        Conta contaAbner = new Conta("Abner Souza", 3000.00, "corrente");

        operacaoBancaria.transferir(contaEdy, contaAbner, 5000.00);

        contaAbner.exibirSaldo();
        contaEdy.exibirSaldo();

        System.out.println(contaEdy.getNumero());
        System.out.println(contaAbner.getNumero());
    }

}
