package com.edn.javabasico.ponteiro;

public class GarbageCollector {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        System.out.println(p1);
        System.out.println(p2);

        p2 = p1;

        System.out.println(p1);
        System.out.println(p2);
    }

}
