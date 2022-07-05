package com.edn.javabasico.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Introducao {

    public static void main(String[] args) {

        List<String> estados = new ArrayList<>();

        // add valor a uma ArrayList
        estados.add("Sao Paulo");
        estados.add("Ceara");
        estados.add("Rio de Janeiro");

        List<String> estados2 = new ArrayList<>();

        // add valor a uma ArrayList
        estados2.add("Santa Catarina");
        estados2.add("Bahia");
        estados2.add("Minas Gerais");

        // obter um item da lista
        String item1 = estados.get(0);

        // obter tamanho lista
        int tamanho = estados.size();

        // iterando a lista v1
        for (int i = 0; i < estados.size(); i++) {
            System.out.println(estados.get(i));
        }

        // iterando a lista v2
        for (String item : estados) {
            System.out.println(item);
        }

        // verifica se a lista e vazia
        System.out.println(estados.isEmpty());

        estados.remove(0);

        estados.addAll(estados2);

        // iterando a lista v3
        estados.forEach( item -> {
            System.out.println(item);
        });

    }

}
