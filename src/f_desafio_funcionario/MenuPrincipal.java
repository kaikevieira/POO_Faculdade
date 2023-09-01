package f_desafio_funcionario;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class MenuPrincipal {
    private static List<String> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String[] opcoes = {"Contratar funcionário", "Ver total de funcionários", "Sair"};
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção:",
                    "Menu Principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            switch (escolha) {
                case 0:
                    contratarFuncionario();
                    break;
                case 1:
                    verTotalFuncionarios();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saindo do programa.");
                    System.exit(0);
            }
        }
    }

    public static void contratarFuncionario() {
        String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionário:"));

        String resultado = Funcionario.contratar(nome, idade);
        funcionarios.add(nome);
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void verTotalFuncionarios() {
        int total = Funcionario.getTotalFuncionarios();
        String listaFuncionarios = String.join("\n", funcionarios);
        String mensagem = "Total de funcionários: " + total + "\nLista de funcionários:\n" + listaFuncionarios;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}