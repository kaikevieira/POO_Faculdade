package correcao;

public class Poligono extends Forma {
    protected int lados;

    public Poligono(String nome, int lados){
        super(nome);
        this.lados = lados;
    }


    
    @Override
    public String toString() {
        return super.toString()+" tenho "+ getLados() + "lados";
    }



    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }
}
    

