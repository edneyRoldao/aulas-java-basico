package com.edn.javabasico.modificadorstatic;

public class Sistema {

    public static void main(String... args) {
        Conta c = new Conta();
        Conta c2 = new Conta();
        c2.TOTAL_OBJ_CRIADOS = 10;
        Conta c3 = new Conta();
        c3.TOTAL_OBJ_CRIADOS = 30;

        c3.setNumero(10);
        c2.setNumero(20);

        System.out.println(c.TOTAL_OBJ_CRIADOS);
        System.out.println(Conta.TOTAL_OBJ_CRIADOS);
        System.out.println(c2.getNumero());
        System.out.println(c3.getNumero());
    }

}
