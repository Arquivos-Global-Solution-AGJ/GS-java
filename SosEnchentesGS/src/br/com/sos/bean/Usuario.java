package br.com.sos.bean;

public class Usuario {
    private String nome;
    private String regiao;

    public Usuario(){

    }

    public Usuario(String nome, String regiao) {
        this.nome = nome;
        this.regiao = regiao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String cadastrar(String nome, String regiao) {
        this.nome = nome;
        this.regiao = regiao;
        return "Usuário " + nome + " cadastrado na região " + regiao + " com sucesso!";
    }
}
