package com.edn.javabasico.lambida;


import java.util.List;

/*
 * Quero verificar se um determinado valor aparce pelo menos uma vez na lista
 * */
public class ELAnyMatch {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(10, 20, 30, 40, 50);

        boolean r = isNumberPresentSemEL(numeros, 60);
        boolean r2 = isNumberPresentComEL(numeros, 50);
        System.out.println(r);
        System.out.println(r2);
    }

    static boolean isNumberPresentSemEL(List<Integer> values, Integer num) {
        for (Integer item : values) {
            if (item.equals(num))
                return true;
        }
        return false;
    }

    static boolean isNumberPresentComEL(List<Integer> values, Integer num) {
        return values.stream().anyMatch(item -> item.equals(num));
    }

}
