package com.edn.javabasico.lambida;

public class Conta {

    private Integer id;
    private String cliente;
    private Double saldo;

    public Conta(Integer id, String cliente, Double saldo) {
        this.id = id;
        this.cliente = cliente;
        this.saldo = saldo;
    }


    public Integer getId() {
        return id;
    }

    public Conta setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getCliente() {
        return cliente;
    }

    public Conta setCliente(String cliente) {
        this.cliente = cliente;
        return this;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Conta setSaldo(Double saldo) {
        this.saldo = saldo;
        return this;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", saldo=" + saldo +
                '}';
    }

}
