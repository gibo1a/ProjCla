package aula08;

public class Motociclo extends Veiculo {
    private String tipo;

    Motociclo(){}

    Motociclo(String matricula, String marca, String modelo, int potencia, String tipo){
        super(matricula,marca, modelo,potencia);
        this.setTipo(tipo);
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
