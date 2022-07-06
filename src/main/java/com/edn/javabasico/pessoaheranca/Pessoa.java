package com.edn.javabasico.pessoaheranca;

public class Pessoa {

    public void podeSerSobrescrito() {
        System.out.println("estou na classe pai");
    }

    public final void naoPodeSerSobrescrito() {
        System.out.println("estou na classe pai");
    }

}
