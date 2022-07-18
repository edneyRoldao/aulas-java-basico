package com.edn.javabasico.collections;

import java.util.List;

public class OrdenacaoLista {

    public static void main(String[] args) {
        List<String> nomes = List.of("edney", "erick", "abner");

        for (String item : nomes) {
            System.out.println(item);
        }
    }

}
