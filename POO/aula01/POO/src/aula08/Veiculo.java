package aula08;

import java.util.ArrayList;

public class Veiculo implements KmPercorridosInterface{
    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private ArrayList<Integer> distancias;
    
    Veiculo(){}

    Veiculo(String matricula){
        this.setMatricula(matricula);
        this.distancias = new ArrayList<Integer>();
    }

    Veiculo(String matricula, String marca, String modelo, int potencia){
        this.setMatricula(matricula);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPotencia(potencia);
        this.distancias = new ArrayList<Integer>();
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public ArrayList<Integer> getDistancias() {
        return distancias;
    }

    @Override
    public void trajeto(int quilometros) {
        this.getDistancias().add(quilometros);
    }

    @Override
    public int ultimoTrajeto() {
        return this.getDistancias().get(this.getDistancias().size() - 1);
    }

    @Override
    public int distanciaTotal() {
        int sum = 0;
        for(Integer i : this.getDistancias())
            sum += i;
        return sum;
    }


}
