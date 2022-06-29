package com.edn.javabasico.bancotabajara;

public class SistemaBanco {

    public static void main(String[] args) {
        OperacaoBancaria operacaoBancaria = new OperacaoBancaria();

        // edney acessando a conta
        Conta contaEdy = new Conta();
        contaEdy.nomeCliente = "Edney Roldao";
        contaEdy.numero = 200;
        contaEdy.saldo = 5000.00;

        contaEdy.exibirSaldo();

        // fazendo um deposito na conta do edney
        operacaoBancaria.depositar(contaEdy, 5000.00);

        contaEdy.exibirSaldo();

        operacaoBancaria.sacar(contaEdy, 20000.00);

        Conta contaAbner = new Conta();
        contaAbner.saldo = 3000.00;
        contaAbner.numero = 1;
        contaAbner.nomeCliente = "Abner Souza";

        operacaoBancaria.transferir(contaEdy, contaAbner, 5000.00);

        contaAbner.exibirSaldo();
        contaEdy.exibirSaldo();
    }

}
