package com.edn.javabasico.setlist;

import java.util.HashSet;
import java.util.Set;

public class Introducao {

    public static void main(String[] args) {

        Set<String> estados = new HashSet<>();
        estados.add("Sao Paulo");
        estados.add("Rio de Janeiro");
        estados.add("Sao Paulo");
        estados.add("Rio de Janeiro");

        for (String item : estados) {
            System.out.println(item);
        }

    }

}
