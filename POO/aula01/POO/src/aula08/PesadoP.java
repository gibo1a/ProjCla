package aula08;

public class PesadoP extends Apesado{
    private int lugares;

    PesadoP(){}

    PesadoP(String matricula, String marca, String modelo, int potencia, int numquadro, double peso, int lugares){
        super(matricula, marca, modelo, potencia, numquadro, peso);
        this.setLugares(lugares);

    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }
    
}
