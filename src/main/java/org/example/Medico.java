package org.example;

public class Medico {
    private Integer CRM;
    private String nome;
    private boolean ativo;
    private String especialidade;

    public Medico(String nome, Integer CRM, boolean ativo, String especialidade) {
        this.nome = nome;
        this.CRM = CRM;
        this.ativo = ativo;
        this.especialidade = especialidade;
    }

    public Integer getCRM() {
        return CRM;
    }

    public void setCRM(Integer CRM) {
        this.CRM = CRM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
