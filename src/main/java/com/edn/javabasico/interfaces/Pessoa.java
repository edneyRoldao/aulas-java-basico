package com.edn.javabasico.interfaces;

import java.util.Objects;
import java.util.Random;

public class Pessoa implements Comparable<Pessoa> {

    private String cpf;
    private String nome;
    private String sobreNome;
    private final Integer id;

    public Pessoa(String cpf, String nome, String sobreNome) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobreNome = sobreNome;

        this.id = new Random().nextInt(10) + 1;
    }

    public Integer getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public Pessoa setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public Pessoa setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
        return this;
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.sobreNome.compareTo(o.sobreNome);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(cpf, pessoa.cpf) && Objects.equals(nome, pessoa.nome) && Objects.equals(sobreNome, pessoa.sobreNome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome, sobreNome);
    }

}
