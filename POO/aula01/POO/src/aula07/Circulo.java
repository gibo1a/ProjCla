import java.lang.Math;

public class Circulo extends Forma{
    private double raio; 

    Circulo(){
    }

    Circulo(double raio){
        this.setRaio(raio);
    }

    Circulo(double raio,String cor){
        this.setRaio(raio);
        this.setCor(cor);
    }

    private double getRaio(){
        return raio;
    }

    private void setRaio(double raio){
        this.raio = raio;
    }
    @Override
    public double area() {
        return Math.PI*(Math.pow(raio,2));
    }

    @Override
    public double perimetro() {
        return ((3*Math.PI)*raio);
    }
}
