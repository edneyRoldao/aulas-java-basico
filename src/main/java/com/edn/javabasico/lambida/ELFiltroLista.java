package com.edn.javabasico.lambida;

import java.util.ArrayList;
import java.util.List;

public class ELFiltroLista {

    public static void main(String[] args) {
        Integer idConta = 1;

        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta(1, "edy", 11.00));
        contas.add(new Conta(2, "dfgsdf", 100.00));
        contas.add(new Conta(3, "hjfghj", 1000.00));
        contas.add(new Conta(4, "bcvncvbn", 10000.00));
        contas.add(new Conta(5, "swqasa", 100000.00));
        contas.add(new Conta(6, "kjoluiou", 10000000.00));

//        idConta = 20;

        Conta conta = contas
                .stream()
                .filter(c -> c.getId().equals(idConta))
                .findAny()
                .get();

        System.out.println(conta);
    }

}
