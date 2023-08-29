package c_encapsulamento;

public class Principal {
    
    public static void main(String[] args) {
        Pessoas p = new Pessoas();
        p.nome = "joloo";
        p.idade = -10;
        System.out.println(p.nome + " - " + p.idade);
    }
    
}
