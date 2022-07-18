package com.edn.javabasico.orientacao_objetos.pessoas;

public abstract class Pessoa {

    private Integer id;
    private String nome;
    private String endereco;

    public void mostrarEndereco() {
        System.out.println(endereco);
    }

    public Integer getId() {
        return id;
    }

    public Pessoa setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Pessoa setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }
}
