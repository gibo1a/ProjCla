package aula08;

public class Taxi extends Aligeiro{
    private int numlic;

    Taxi(){}

    Taxi(String matricula, String marca, String modelo, int potencia, int numquadro, int capbag, int numlic){
        super(matricula, marca, modelo, potencia, numquadro, capbag);
        this.setNumlic(numlic);

    }

    public void setNumlic(int numlic) {
        this.numlic = numlic;
    }

    public int getNumlic() {
        return numlic;
    }
    
}
