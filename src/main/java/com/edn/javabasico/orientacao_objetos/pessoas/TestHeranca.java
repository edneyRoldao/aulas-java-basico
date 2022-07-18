package com.edn.javabasico.orientacao_objetos.pessoas;

public class TestHeranca {

    public static void main(String[] args) {
        PessoaFIsica pf = new PessoaFIsica();
        pf.setId(1);
        pf.setEndereco("RUA MARIE");

        PessoaJuridica pj = new PessoaJuridica();

        pf.mostrarEndereco();

        AcaoPessoa ap = new AcaoPessoa();

        ap.validarDocumento(pf);
        ap.validarDocumento(pj);
    }

}
