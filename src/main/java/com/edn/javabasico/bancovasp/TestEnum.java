package com.edn.javabasico.bancovasp;

public class TestEnum {

    public static void main(String[] args) {
        // obtendo um enum
        TipoConta tp = TipoConta.POUPANCA;

        // obtendo o valor numerico do enum
        int vNumericoEnum = tp.ordinal();

        // obtendo o valor textual do enum
        String vTextualEnum = tp.name();

        System.out.println(vNumericoEnum);
        System.out.println(vTextualEnum);
    }

}
