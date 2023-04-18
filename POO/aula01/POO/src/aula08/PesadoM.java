package aula08;

public class PesadoM extends Apesado{
    private int cargaM;

    PesadoM(){}

    PesadoM(String matricula, String marca, String modelo, int potencia, int numquadro, double peso, int cargaM){
        super(matricula, marca, modelo, potencia, numquadro, peso);
        this.setCargaM(cargaM);

    }

    public void setCargaM(int cargaM) {
        this.cargaM = cargaM;
    }

    public int getCargaM() {
        return cargaM;
    }
    
}
