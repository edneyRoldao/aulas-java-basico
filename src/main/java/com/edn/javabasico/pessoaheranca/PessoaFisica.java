package com.edn.javabasico.pessoaheranca;

public class PessoaFisica extends Pessoa {

    @Override
    public void podeSerSobrescrito() {
        System.out.println("estou na classe filho");
    }

}
