package com.edn.javabasico.lambida;

import com.edn.javabasico.interfaces.AccountValidation;

import java.util.List;

public class ELIntroducao {

    public static void main(String[] args) {

        List<String> nomes = List.of("Edney", "Erick", "Abner", "Ricardo");

        // sem lambda
        for (String el : nomes) {
            System.out.println(el);
        }

        // com lambda com method reference
        nomes.forEach(System.out::println);

        // com lambda sem method reference
        nomes.forEach(el -> {
            System.out.println(el);
        });

        AccountValidation av1 = () -> true;

        AccountValidation av2 = () -> {
            System.out.println();
            return true;
        };

        AccountValidation av3 = new AccountValidation() {
            @Override
            public boolean validate() {
                return false;
            }
        };

    }

}
