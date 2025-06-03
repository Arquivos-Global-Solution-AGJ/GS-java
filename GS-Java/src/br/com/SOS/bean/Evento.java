package br.com.SOS.bean;

public class Evento {
    //atributos
    private int pessoasAfetadas, nivelAlerta;
    private String tipoEvento, duracao, regiao;

    //construtores
    public Evento(){

    }

    public Evento(int pessoasAfetadas, int nivelAlerta, String tipoEvento, String duracao, String regiao) {
        this.pessoasAfetadas = pessoasAfetadas;
        this.nivelAlerta = nivelAlerta;
        this.tipoEvento = tipoEvento;
        this.duracao = duracao;
        this.regiao = regiao;
    }

    //getters/setters

    public int getPessoasAfetadas() {
        return pessoasAfetadas;
    }

    public void setPessoasAfetadas(int pessoasAfetadas) {
        this.pessoasAfetadas = pessoasAfetadas;
    }

    public int getNivelAlerta() {
        return nivelAlerta;
    }

    public void setNivelAlerta(int nivelAlerta) {
        this.nivelAlerta = nivelAlerta;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    //metodo da classe
    public String classificarSeveridade(double pontuacao){
        return 0;
    }
    public String calcularForca(int pessoasAfetadas){
        return 0;
    }
}
