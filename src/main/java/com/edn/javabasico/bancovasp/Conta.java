package com.edn.javabasico.bancovasp;

public class Conta {

    // caracteristicas de uma conta
    Integer numero;
    String nomeCliente;
    Integer agencia;
    String tipoConta;
    Double saldo;

    void exibirSaldoEmTela() {
        String msgSaldo = String.format("%s seu saldo é %s", nomeCliente, saldo);
        System.out.println(msgSaldo);
    }

}
