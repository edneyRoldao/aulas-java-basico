package com.edn.javabasico.orientacao_objetos.pessoas;

public class PessoaFIsica extends Pessoa {

    private String cpf;
    private String genero;
    private String dataNascimento;

    @Override
    public void mostrarEndereco() {
        super.mostrarEndereco();
        System.out.println("sou o filho: PessoaFisica");
    }

    public String getCpf() {
        return cpf;
    }

    public PessoaFIsica setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getGenero() {
        return genero;
    }

    public PessoaFIsica setGenero(String genero) {
        this.genero = genero;
        return this;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public PessoaFIsica setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }
}
