package com.edn.javabasico.bancovasp;

public class OperacaoBancaria {

    public void sacar(Conta conta, Double valor) {
        if (temSaldo(conta, valor)) {
            Double novoSaldo = conta.getSaldo() - valor;
            conta.setSaldo(novoSaldo);
            System.out.printf("%s sacou: %s \n", conta.getNomeCliente(), valor);
        } else {
            System.out.printf("%s seu saldo e insulficiente para realizar o saque de %s \n", conta.getNomeCliente(), valor);
        }
    }

    public void depositar(Conta conta, Double valor) {
        Double novoSaldo = conta.getSaldo() + valor;
        conta.setSaldo(novoSaldo);
        System.out.printf("%s depositou %s \n", conta.getNomeCliente(), valor);
    }

    public void transferir(Conta contaOrigem, Conta contaDestino, Double valor) {
        if (temSaldo(contaOrigem, valor)) {
            sacar(contaOrigem, valor);
            depositar(contaDestino, valor);
        } else {
            System.out.printf("%s seu saldo e insulficiente para realizar a transferencia de %s \n", contaOrigem.getNomeCliente(), valor);
        }
    }

    boolean temSaldo(Conta conta, Double valor) {
        return conta.getSaldo() >= valor;
    }

}
