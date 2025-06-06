package br.com.sos.bean;

import javax.swing.*;

public class Evento {
    private int pessoasAfetadas;
    private String tipoEvento;
    private String duracao;
    private String regiao;
    private int nivelAlerta;
    private int pontuacao;

    public Evento() {
    }

    public Evento(int pessoasAfetadas, String tipoEvento, String duracao, String regiao, int nivelAlerta, int pontuacao) {
        this.pessoasAfetadas = pessoasAfetadas;
        this.tipoEvento = tipoEvento;
        this.duracao = duracao;
        this.regiao = regiao;
        this.nivelAlerta = nivelAlerta;
        this.pontuacao = pontuacao;
    }

    public int getPessoasAfetadas() {
        return pessoasAfetadas;
    }

    public void setPessoasAfetadas(int pessoasAfetadas) {
        this.pessoasAfetadas = pessoasAfetadas;
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

    public int getNivelAlerta() {
        return nivelAlerta;
    }

    public void setNivelAlerta(int nivelAlerta) {
        this.nivelAlerta = nivelAlerta;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String classificarSeveridade() {
        if (pontuacao >= 80) {
            return "Severidade Alta";
        } else if (pontuacao >= 50) {
            return "Severidade Média";
        } else {
            return "Severidade Baixa";
        }
    }

    public String calcularForca(int pessoasAfetadas) {
        return "Força não especificada: este evento não possui cálculo definido.";
    }
}
