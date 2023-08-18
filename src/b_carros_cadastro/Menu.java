package b_carros_cadastro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<Carro>();
        String menu = "1 - Cadastrar.\n"
                    + "2 - Listar todos.\n"
                    + "3 - Listar por cor.\n"
                    + "4 - Listar por ano.\n"
                    + "5 - Listar por marca.\n"
                    + "6 - Sair!\n";
        int i = 0;

        do{
            i = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if (i == 1) {
                Carro c = new Carro();
                c.cadastra();
                carros.add(c);
            } 
            else if (i == 2){
                String result = "Carros cadastrados: \n\n";
                for (Carro c: carros) {
                    result += c.exibirDados();
                } JOptionPane.showMessageDialog(null,result);
            }
            else if (i == 3){
                String result = "Carros cadastrados: \n\n";
                String carroCor = JOptionPane.showInputDialog("Qual a cor que deseja buscar?");
                for (Carro c: carros) {
                    if (c.cor.equals(carroCor)) {
                        result += c.exibirDados();
                    } JOptionPane.showMessageDialog(null,result);
                }
            }
        }while (i != 6);
    }
}