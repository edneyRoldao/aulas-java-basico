package com.edn.javabasico.bancovasp;

public class OperacaoBancaria {

    void sacar(Conta conta, Double valor) {
        if (temSaldo(conta, valor)) {
            conta.saldo = conta.saldo - valor;
            System.out.printf("%s sacou: %s \n", conta.nomeCliente, valor);
        } else {
            System.out.printf("%s seu saldo e insulficiente para realizar o saque de %s \n", conta.nomeCliente, valor);
        }
    }

    void depositar(Conta conta, Double valor) {
        conta.saldo = conta.saldo + valor;
        System.out.printf("%s depositou %s \n", conta.nomeCliente, valor);
    }

    void transferir(Conta contaOrigem, Conta contaDestino, Double valor) {
        if (temSaldo(contaOrigem, valor)) {
            sacar(contaOrigem, valor);
            depositar(contaDestino, valor);
        } else {
            System.out.printf("%s seu saldo e insulficiente para realizar a transferencia de %s \n", contaOrigem.nomeCliente, valor);
        }
    }

    boolean temSaldo(Conta conta, Double valor) {
        return conta.saldo >= valor;
    }

}
