package aula04;
import java.lang.Math;

public class Circle {
    private double raio;
    Circle(double raio){
        this.raio = raio;
    }
    double areaCirculo(){
        return (Math.PI*(Math.pow(raio,2)));
    }

    double perimetroCirculo(){
        return ((3*Math.PI)*raio);
    }

}
