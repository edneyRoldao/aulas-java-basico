package com.edn.javabasico.exercicioscorrecao;

import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o Estado: ");
        String estadoInput = input.nextLine();

        String[] estados = new String[]
                {"Acre", "Alagoas", "Amapa", "Amapá", "Amazonas", "Bahia", "Ceara", "Ceará", "Distrito Federal",
                        "Espirito Santo", "Espírito Santo", "Goias", "Goiás", "Maranhao", "Maranhão", "Mato Grosso",
                        "Mato Grosso do Sul", "Minas Gerais", "Para", "Pará", "Paraiba", "Paraíba", "Parana", "Paraná",
                        "Pernambuco", "Piaui", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul",
                        "Rondonia", "Rondônia", "Roraima", "Santa Catarina", "Sao Paulo", "São Paulo", "Sergipe", "Tocantins"};

        String[] siglaEstados = new String[]
                {"AC", "AL", "AP", "AP", "AM", "BA", "CE", "CE", "DF", "ES", "ES", "GO", "GO", "MA", "MA", "MT", "MS", "MG",
                        "PA", "PA", "PB", "PB", "PR", "PR", "PE", "PI", "PI", "RJ", "RN", "RS", "RO", "RO", "RR", "SC", "SP", "SP", "SE", "TO"};

        for (int i = 0; i <= estados.length - 1; i++) {
            if (estados[i].equalsIgnoreCase(estadoInput)) {
                String posicaoSigla = estados[i] + " - " + siglaEstados[i];
                System.out.println(posicaoSigla);
                break;
            }

            if (i == estados.length - 1) {
                System.out.println("Erro, Estado inexistente. Verifique a Ortografia.");
            }
        }
    }

}

