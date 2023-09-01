package b_carros_cadastro;

import javax.swing.JOptionPane;

public class Carro {
    String marca;
    int anoFabricacao = 0;
    String cor;
    
    public void cadastra() {

        marca = JOptionPane.showInputDialog(null, "Qual a marca do carro?").toUpperCase();
            if (marca.equals("")){
                do {
            marca = JOptionPane.showInputDialog(null, "Marca inválida! Insira novamente?").toUpperCase();
        } while (marca.equals(""));
    }

        anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ano de fabricação carro?"));
            if (anoFabricacao <= 0){
                do {
            anoFabricacao= Integer.parseInt(JOptionPane.showInputDialog(null, "Ano inválido! Insira novamente?"));
        } while (anoFabricacao < 1954 || anoFabricacao > 2023);
    }
        cor = JOptionPane.showInputDialog(null, "Qual a cor do carro?").toUpperCase(); 
            if (cor.equals("")){
                do {
            cor = JOptionPane.showInputDialog(null, "Cor inválida! Insira novamente?").toUpperCase();
        } while (cor.equals(""));
    }
}
    String exibirDados(){
        return marca + " - " + anoFabricacao + " - " + cor + "\n";
    }
}
