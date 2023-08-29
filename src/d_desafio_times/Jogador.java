package d_desafio_times;

import javax.swing.JOptionPane;

public class Jogador {

    private String nome;
    private int camisa;
    private int gols;

    public void cadastrar() {
        setNome(JOptionPane.showInputDialog("Qual o nome do jogador?"));
        setCamisa(Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da camisa do jogador?")));
        setGols(Integer.parseInt(JOptionPane.showInputDialog("Quantos gols o jogador fez?")));
    }

    public String exibir() {
        return getNome() + " - " + getCamisa() + " - " + getGols() + "\n";

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCamisa() {
        return camisa;
    }

    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

}
