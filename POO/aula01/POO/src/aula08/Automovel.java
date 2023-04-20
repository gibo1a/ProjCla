package aula08;

public class Automovel extends Veiculo{
    private int numquadro;

    Automovel(){}

    Automovel(String matricula, String marca, String modelo, int potencia, int numquadro){
        super(matricula, marca, modelo, potencia);
        this.setNumquadro(numquadro);
    }

    public void setNumquadro(int numquadro) {
        this.numquadro = numquadro;
    }

    public int getNumquadro() {
        return numquadro;
    }
}
