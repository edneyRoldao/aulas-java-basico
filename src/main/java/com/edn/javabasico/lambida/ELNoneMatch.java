package com.edn.javabasico.lambida;

/*
 * Quero verificar se um determinado valor nao esta presente em uma lista
 * */
import java.util.List;

public class ELNoneMatch {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(10, 20, 30, 40, 50);

        boolean r = isNumberNotPresentSemEL(numeros, 50);
        boolean r2 = isNumberNotPresentComEL(numeros, 50);
        System.out.println(r);
        System.out.println(r2);
    }

    static boolean isNumberNotPresentSemEL(List<Integer> values, Integer num) {
        for (Integer item : values) {
            if  (item.equals(num))
                return false;
        }
        return true;
    }

    static boolean isNumberNotPresentComEL(List<Integer> values, Integer num) {
        return values.stream().noneMatch(item -> item.equals(num));
    }


}
