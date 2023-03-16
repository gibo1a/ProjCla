package aula04;

public class Triangle {
    private double lado1;
    private double lado2;
    private double lado3;
    Triangle(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public double perimetroTriangulo(){
        return (lado1 + lado2 + lado3);

    }
    public double areaTriangulo(){
        double s = (perimetroTriangulo()/2);
        return (Math.sqrt((s*(s-lado1))*(s-lado2)*(s-lado3)));
    }
    
}
