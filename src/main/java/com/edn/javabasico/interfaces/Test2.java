package com.edn.javabasico.interfaces;

public class Test2 {

    public static void main(String[] args) {
        var p1 = new Pessoa("888111", "Erick", "Souza");
        var p2 = new Pessoa("888111", "Erick", "Souza");

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }

}
