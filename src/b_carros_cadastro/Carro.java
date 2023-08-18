package b_carros_cadastro;

import javax.swing.JOptionPane;

public class Carro {
    String marca;
    int anoFabricacao;
    String cor;

    void cadastra() {
        marca = JOptionPane.showInputDialog(null, "Qual a marca do carro?");
        anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ano de fabricação carro?"));
        cor = JOptionPane.showInputDialog(null, "Qual a cor do carro?");
    }
    String exibirDados(){
        return marca + " - " + anoFabricacao + " - " + cor + "\n";
    }
    
}
