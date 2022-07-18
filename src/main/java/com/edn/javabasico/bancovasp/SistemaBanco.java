package com.edn.javabasico.bancovasp;

public class SistemaBanco {

    public static void main(String[] args) {
        var operacaoBancaria = new OperacaoBancaria();

        // edney entrou no sistema do banco
        Conta c1 = new Conta();
        c1.setNomeCliente("Edney Roldao");
        c1.setNumero(1277);
        c1.setAgencia(25);
        c1.setTipoConta(TipoConta.CORRETE);
        c1.setSaldo(1000.00);

        Conta c2 = new Conta();
        c2.setNomeCliente("Erick");
        c2.setNumero(1277);
        c2.setAgencia(25);
        c2.setTipoConta(TipoConta.POUPANCA);
        c2.setSaldo(3000.00);

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

        System.out.println(c2);
        c2.exibirTipoConta();
        c2.exibirCodigoReferenciaMemoria();
    }

}
