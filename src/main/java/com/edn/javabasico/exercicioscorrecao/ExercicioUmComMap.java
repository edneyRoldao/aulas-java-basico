package com.edn.javabasico.exercicioscorrecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioUmComMap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o Estado: ");
        String estadoInput = input.nextLine();
        estadoInput = estadoInput.toUpperCase();

        Map<String, String> estadosMap = new HashMap<>();
        estadosMap.put("SAO PAULO", "SP");
        estadosMap.put("RIO DE JANEIRO", "RJ");
        estadosMap.put("MINAS GERAIS", "MG");

        String valor = estadosMap.get(estadoInput);

        if (valor == null) {
            System.out.println("Erro, Estado inexistente. Verifique a Ortografia.");
            return;
        }

        // for no map
        for (Map.Entry<String, String> entry : estadosMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println(valor);
    }

}
