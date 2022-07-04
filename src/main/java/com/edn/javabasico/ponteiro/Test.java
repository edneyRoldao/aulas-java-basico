package com.edn.javabasico.ponteiro;

public class Test {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.name = "edney";

        Pessoa p2 = new Pessoa();
        p2.name = "edney";

        if (p1 == p2)
            System.out.println("igual");
        else
            System.out.println("diferente");

        System.out.println(p1);
        System.out.println(p2);
    }

}
