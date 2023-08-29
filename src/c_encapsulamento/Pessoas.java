package c_encapsulamento;

public class Pessoas {

    String nome;
    int idade;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade<0 && idade>110){
        this.idade = idade;
        }
    }
}
