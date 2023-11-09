package correcao;

import java.util.ArrayList;

public class Questao1 {

    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo());
        formas.add(new Quadrado());
        formas.add(new Triangulo());
        formas.add(new Hexagono());

        for (Forma f : formas) {
            f.desenhar();
            System.out.println(f);
        }
    }
    
}
