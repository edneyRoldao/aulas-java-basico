package com.edn.javabasico.ponteiro;

public class Test3 {

    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[2];
        Pessoa p1 = new Pessoa();
        p1.name = "edney";

        Pessoa p2 = new Pessoa();
        p2.name = "filipe";

        pessoas[0] = p1;
        pessoas[1] = p2;

        for (Pessoa p : pessoas) {
            System.out.println(p.name);
        }

        Pessoa p = pessoas[0];
        p.name = "joao das couves";

        for (Pessoa e : pessoas) {
            System.out.println(e.name);
        }

    }

}
