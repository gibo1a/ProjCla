package aula08;

public class Aligeiro extends Automovel{
    private int capbag;

    Aligeiro(){}

    Aligeiro(String matricula, String marca, String modelo, int potencia, int numquadro, int capbag){
        super(matricula, marca, modelo, potencia, numquadro);
        this.setCapbag(capbag);
    }

    public void setCapbag(int capbag) {
        this.capbag = capbag;
    }
    
    public int getCapbag() {
        return capbag;
    }
}
