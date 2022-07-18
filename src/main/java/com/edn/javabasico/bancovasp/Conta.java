package com.edn.javabasico.bancovasp;

public class Conta {

    // caracteristicas de uma conta
    private Integer numero;
    private String nomeCliente;
    private Integer agencia;
    private TipoConta tipoConta;
    private Double saldo;

    public void exibirSaldoEmTela() {
        String msgSaldo = String.format("%s seu saldo é %s", nomeCliente, saldo);
        System.out.println(msgSaldo);
    }

    public void exibirTipoConta() {
        System.out.println(tipoConta.name());
    }

    // getters and setters
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tp) {
        tipoConta = tp;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo =saldo;
    }

    public void exibirCodigoReferenciaMemoria() {
        System.out.println(this);
        System.out.println(this.nomeCliente);
    }

}
