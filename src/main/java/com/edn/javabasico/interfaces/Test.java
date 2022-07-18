package com.edn.javabasico.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("888111", "Erick", "Souza"));
        pessoas.add(new Pessoa("400777", "Abner", "Souza"));
        pessoas.add(new Pessoa("300404", "Edney", "Roldao"));

        for (Pessoa p : pessoas) {
            System.out.println(p.getNome());
        }

        Collections.sort(pessoas);

        System.out.println("-----------------------------");

        for (Pessoa p : pessoas) {
            System.out.println(p.getNome());
        }
    }

}
