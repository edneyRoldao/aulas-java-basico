package com.edn.javabasico.foreach;

import java.util.List;

public class Exemplo {

    public static void main(String[] args) {

        List<String> nomes = List.of("edney", "erick", "abner");

        for (String item : nomes) {
            System.out.println(item);
        }

    }

}
