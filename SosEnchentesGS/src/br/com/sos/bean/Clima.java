package br.com.sos.bean;

public class Clima {
    private String condicao;
    private double temperatura;
    private double umidade;

    public Clima(){

    }

    public Clima(String condicao, double temperatura, double umidade) {
        this.condicao = condicao;
        this.temperatura = temperatura;
        this.umidade = umidade;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getUmidade() {
        return umidade;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }

    public String verificarCondicao(double temperatura, double umidade) {
        if (temperatura > 30 && umidade < 40) {
            return "Clima seco e quente";
        } else if (umidade > 70) {
            return "Clima úmido";
        } else {
            return "Clima estável";
        }
    }
}
