package f_desafio_funcionario;

public class Funcionario {
    private static int totalFuncionarios = 0;
    private static int idadeMinima = 18;

    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public static int getIdadeMinima() {
        return idadeMinima;
    }

    public static String contratar(String nome, int idade) {
        if (idade >= idadeMinima) {
            totalFuncionarios++;
            return "Funcionário " + nome + " contratado com sucesso!";
        } else {
            return "Funcionário " + nome + " não pode ser contratado devido à idade.";
        }
    }
}