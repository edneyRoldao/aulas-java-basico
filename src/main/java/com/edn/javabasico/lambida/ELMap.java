package com.edn.javabasico.lambida;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Eu quero extrair somente o numero das contas
 * */
public class ELMap {

    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta(1, "edy", 10.00));
        contas.add(new Conta(2, "edy", 10.00));
        contas.add(new Conta(3, "edy", 10.00));
        contas.add(new Conta(4, "edy", 10.00));
        contas.add(new Conta(5, "edy", 10.00));
        contas.add(new Conta(6, "edy", 10.00));

        List<Integer> numeroContas = new ArrayList<>();

        for (Conta conta : contas) {
           numeroContas.add(conta.getId());
        }

        List<Integer> numeroContas2 = contas
                .stream()
                .map(conta -> {
                    return conta.getId();
                })
                .collect(Collectors.toList());


    }

}
