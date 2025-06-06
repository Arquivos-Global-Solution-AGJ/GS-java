package br.com.sos.bean;

public class Chuva extends Evento{
    private String intensidade;
    private double nivelRio;
    private double chuvaAcumulada;

    public Chuva(){

    }

    public Chuva(int pessoasAfetadas, String tipoEvento, String duracao, String regiao, int nivelAlerta, int pontuacao, String intensidade, double nivelRio, double chuvaAcumulada) {
        super(pessoasAfetadas, tipoEvento, duracao, regiao, nivelAlerta, pontuacao);
        this.intensidade = intensidade;
        this.nivelRio = nivelRio;
        this.chuvaAcumulada = chuvaAcumulada;
    }

    public String getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(String intensidade) {
        this.intensidade = intensidade;
    }

    public double getNivelRio() {
        return nivelRio;
    }

    public void setNivelRio(double nivelRio) {
        this.nivelRio = nivelRio;
    }

    public double getChuvaAcumulada() {
        return chuvaAcumulada;
    }

    public void setChuvaAcumulada(double chuvaAcumulada) {
        this.chuvaAcumulada = chuvaAcumulada;
    }

    // 🚀 Sobrecarga
    public String classificarSeveridade(int nivelRio, int chuvaAcumulada) {
        double risco = (nivelRio * 0.6) + (chuvaAcumulada * 0.4);
        if (risco > 100) {
            return "Enchente Extrema";
        } else if (risco > 70) {
            return "Enchente Moderada";
        } else {
            return "Enchente Leve";
        }
    }

    public String verificarEnchente(double nivelRio, double chuvaAcumulada) {
        if (nivelRio >= 10 && chuvaAcumulada >= 120) {
            return "Enchente Extrema! Ação imediata necessária!";
        } else if (nivelRio >= 8 || chuvaAcumulada >= 100) {
            return "Alto risco de Enchente!";
        } else if (nivelRio >= 6 || chuvaAcumulada >= 80) {
            return "Risco Moderado de Enchente.";
        } else {
            return "Sem risco significativo de enchente.";
        }
    }
}
