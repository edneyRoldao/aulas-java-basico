package com.edn.javabasico.dowhile;

public class Exemplo {

    public static void main(String[] args) {
        int n = 10;

        while (n > 10) {
            System.out.println("nao entra no while teste");
        }

        System.out.println("-----------------------------------");

        do {
            System.out.println("vai entrar no do while");
        } while (n > 10);



        System.out.println("fim do processo");
    }

}
