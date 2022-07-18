package com.edn.javabasico.orientacao_objetos.pessoas;

import java.util.List;

public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String dataCriacao;
    private String contratoSocial;
    private List<String> proprietarios;


    public String getCnpj() {
        return cnpj;
    }

    public PessoaJuridica setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public PessoaJuridica setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
        return this;
    }

    public String getContratoSocial() {
        return contratoSocial;
    }

    public PessoaJuridica setContratoSocial(String contratoSocial) {
        this.contratoSocial = contratoSocial;
        return this;
    }

    public List<String> getProprietarios() {
        return proprietarios;
    }

    public PessoaJuridica setProprietarios(List<String> proprietarios) {
        this.proprietarios = proprietarios;
        return this;
    }
}
