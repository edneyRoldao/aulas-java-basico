package com.edn.javabasico.ponteiro;

public class Test2 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.name = "erick";

        Pessoa p2 = p1;

        System.out.println(p1.name);
        System.out.println(p2.name);

        p2.name = "Abner";

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p1 == p2);
    }

}
