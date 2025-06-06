package br.com.sos.bean;

import javax.swing.*;

public class Ventania extends Evento{
    private String direcaoVento;
    private double velocidadeVento;
    private double tempo;

    public Ventania(){

    }

    public Ventania(int pessoasAfetadas, String tipoEvento, String duracao, String regiao, int nivelAlerta, int pontuacao, String direcaoVento, double velocidadeVento, double tempo) {
        super(pessoasAfetadas, tipoEvento, duracao, regiao, nivelAlerta, pontuacao);
        this.direcaoVento = direcaoVento;
        this.velocidadeVento = velocidadeVento;
        this.tempo = tempo;
    }

    public String getDirecaoVento() {
        return direcaoVento;
    }

    public void setDirecaoVento(String direcaoVento) {
        this.direcaoVento = direcaoVento;
    }

    public double getVelocidadeVento() {
        return velocidadeVento;
    }

    public void setVelocidadeVento(double velocidadeVento) {
        this.velocidadeVento = velocidadeVento;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    // Sobrescrita

    public String calcularForca(int pessoasAfetadas) {
        if (pessoasAfetadas > 500) {
            return "Vendaval de Grande Impacto";
        } else {
            return "Vendaval de Impacto Moderado";
        }
    }


    public String avaliarRisco(double velocidadeVento, double tempo) {
        if (velocidadeVento > 75) {
            return "Risco Alto de Vendaval!";
        } else if (velocidadeVento > 50){
            return "Risco Moderado de vendaval";
        }else{
            return "Risco baixo de vendaval";
        }
    }

}
