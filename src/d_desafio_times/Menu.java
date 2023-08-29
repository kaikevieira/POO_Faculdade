package d_desafio_times;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        ArrayList<Time> times = new ArrayList<Time>();
        String menu = "1 - Cadastrar time.\n"
                    + "2 - Listar jogadores por time.\n"
                    + "3 - Verificar artilheiro por time.\n"
                    + "4 - Time com mais gols.\n"
                    + "5 - Sair!\n";
                
        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if (op == 1) {
                Time t = new Time();
                t.cadastrar();
                times.add(t);
            }
            if (op == 2) {

                String ask = JOptionPane.showInputDialog("Qual o nome de time que deseja consultar?");
                String result = "Jogadores no time: \n";

                for (Time t : times) {
                    if (ask.equalsIgnoreCase(t.getNome())) {
                        result += t.exibirDados();
                    }
                }
                JOptionPane.showMessageDialog(null, result);

            }
            if (op == 3) {

                String ask = JOptionPane.showInputDialog("Qual o nome de time que deseja consultar o artilheiro?");
                String result = "Artilheiro do time: \n";

                for (Time t : times) {
                    if (ask.equalsIgnoreCase(t.getNome())) {
                        Jogador artilheiro = t.artilheiroTime();
                        result += artilheiro.exibir();
                    }
                }
                JOptionPane.showMessageDialog(null, result);

            }
            if (op == 4) {
                Time timeMaisGols = null;
                int maxGols = -1; 

                for (Time t : times) {
                    int golsTime = t.getGolsTime();
                    if (golsTime > maxGols) {
                        maxGols = golsTime;
                        timeMaisGols = t;
                    }
                }

                if (timeMaisGols != null) {
                    JOptionPane.showMessageDialog(null,
                            "Time com mais gols: " + timeMaisGols.getNome() + " - Total de gols: " + maxGols);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Não há times cadastrados ou não foi possível determinar o time com mais gols.");
                }
            }

        } while (op != 5);
    }
}
