package com.edn.javabasico.bancovasp;

public class SistemaBanco {

    public static void main(String[] args) {
        var operacaoBancaria = new OperacaoBancaria();

        // edney entrou no sistema do banco
        Conta c1 = new Conta();
        c1.nomeCliente = "Edney Roldao";
        c1.numero = 1277;
        c1.agencia = 25;
        c1.tipoConta = "corrente";
        c1.saldo = 1000.00;

        Conta c2 = new Conta();
        c2.nomeCliente = "Erick";
        c2.numero = 1277;
        c2.agencia = 25;
        c2.tipoConta = "corrente";
        c2.saldo = 3000.00;

        // edney deseja ver o saldo
        c1.exibirSaldoEmTela();

        // edney deseja depositar
        operacaoBancaria.depositar(c1, 1000.00);

        c1.exibirSaldoEmTela();

        operacaoBancaria.sacar(c1, 5000.00);
        operacaoBancaria.sacar(c1, 500.00);

        c1.exibirSaldoEmTela();

        operacaoBancaria.transferir(c1, c2, 1000.00);

        c1.exibirSaldoEmTela();
        c2.exibirSaldoEmTela();
    }

}
