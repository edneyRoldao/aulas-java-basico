package com.edn.javabasico.modificadorstatic;

public class Conta {

    public static Integer TOTAL_OBJ_CRIADOS = 0;

    public final static String TIPO_CONTA = "investimento";

    private Double saldo;
    private Integer numero;

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

    public Conta setNumero(Integer numero) {
        this.numero = numero;
        return this;
    }
}
