package com.edn.javabasico.lambida;

/*
 * Quero verificar se um determinado valor esta presente em todas as posicoes
 * */
import java.util.List;

public class ELAllMatch {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(50, 50, 50, 50, 50);

        boolean r = isNumberPresentSemEL(numeros, 50);
        boolean r2 = isNumberPresentComEL(numeros, 50);
        System.out.println(r);
        System.out.println(r2);
    }

    static boolean isNumberPresentSemEL(List<Integer> values, Integer num) {
        for (Integer item : values) {
            if  (!item.equals(num))
                return false;
        }
        return true;
    }

    static boolean isNumberPresentComEL(List<Integer> values, Integer num) {
        return values.stream().allMatch(item -> item.equals(num));
    }


}
