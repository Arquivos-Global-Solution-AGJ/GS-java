package br.com.sos.main;

import br.com.sos.bean.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "====== SOS ENCHENTES ======\n" +
                            "1 - Cadastrar Usuário\n" +
                            "2 - Registrar Evento de Chuva\n" +
                            "3 - Registrar Evento de Ventania\n" +
                            "4 - Registrar Clima\n" +
                            "5 - Sair\n" +
                            "===========================\n" +
                            "Escolha uma opção:"
            ));

            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    cadastrarChuva();
                    break;
                case 3:
                    cadastrarVentania();
                    break;
                case 4:
                    cadastrarClima();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 5);
    }

    public static void cadastrarUsuario() {
        String nome = JOptionPane.showInputDialog("Informe o nome do usuário:");
        String regiao = JOptionPane.showInputDialog("Informe a região do usuário:");

        Usuario usuario = new Usuario();
        String mensagem = usuario.cadastrar(nome, regiao);

        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static void cadastrarChuva() {
        int pessoasAfetadas = Integer.parseInt(JOptionPane.showInputDialog("Pessoas afetadas:"));
        String duracao = JOptionPane.showInputDialog("Duração do evento:");
        String regiao = JOptionPane.showInputDialog("Região:");
        int nivelAlerta = Integer.parseInt(JOptionPane.showInputDialog("Nível de alerta (1 a 10):"));
        int pontuacao = Integer.parseInt(JOptionPane.showInputDialog("Pontuação do evento (0-100):"));
        String intensidade = JOptionPane.showInputDialog("Intensidade da chuva:");
        double nivelRio = Double.parseDouble(JOptionPane.showInputDialog("Nível do rio (em metros):"));
        double chuvaAcumulada = Double.parseDouble(JOptionPane.showInputDialog("Chuva acumulada (em mm):"));

        Chuva chuva = new Chuva(pessoasAfetadas, "Chuva", duracao, regiao, nivelAlerta, pontuacao, intensidade, nivelRio, chuvaAcumulada);

        String resultado = "Evento de Chuva cadastrado!\n" +
                "Severidade: " + chuva.classificarSeveridade() + "\n" +
                "Verificação de Enchente: " + chuva.verificarEnchente(nivelRio, chuvaAcumulada);

        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void cadastrarVentania() {
        int pessoasAfetadas = Integer.parseInt(JOptionPane.showInputDialog("Pessoas afetadas:"));
        String duracao = JOptionPane.showInputDialog("Duração do evento:");
        String regiao = JOptionPane.showInputDialog("Região:");
        int nivelAlerta = Integer.parseInt(JOptionPane.showInputDialog("Nível de alerta (1 a 10):"));
        int pontuacao = Integer.parseInt(JOptionPane.showInputDialog("Pontuação do evento (0-100):"));
        String direcaoVento = JOptionPane.showInputDialog("Direção do vento:");
        double velocidadeVento = Double.parseDouble(JOptionPane.showInputDialog("Velocidade do vento (km/h):"));
        double tempo = Double.parseDouble(JOptionPane.showInputDialog("Tempo de duração da ventania (em horas):"));

        Ventania ventania = new Ventania(pessoasAfetadas, "Ventania", duracao, regiao, nivelAlerta, pontuacao, direcaoVento, velocidadeVento, tempo);

        String resultado = "Evento de Ventania cadastrado!\n" +
                "Classificação: " + ventania.calcularForca(pessoasAfetadas) + "\n" +
                "Risco: " + ventania.avaliarRisco(velocidadeVento, tempo);

        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void cadastrarClima() {
        String condicao = JOptionPane.showInputDialog("Condição (Ex: Ensolarado, Chuvoso):");
        double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Temperatura atual (°C):"));
        double umidade = Double.parseDouble(JOptionPane.showInputDialog("Umidade (%):"));

        Clima clima = new Clima(condicao, temperatura, umidade);

        String resultado = "Clima cadastrado!\n" +
                "Condição: " + condicao + "\n" +
                "Temperatura: " + temperatura + "°C\n" +
                "Umidade: " + umidade + "%\n" +
                "Verificação: " + clima.verificarCondicao(temperatura, umidade);

        JOptionPane.showMessageDialog(null, resultado);
    }
}
