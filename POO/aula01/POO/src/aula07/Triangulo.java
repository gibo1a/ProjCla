public class Triangulo extends Forma{
    private double lado1;
    private double lado2;
    private double lado3;

    Triangulo(){
    }

    Triangulo(double lado1, double lado2, double lado3){
        this.setLado1(lado1);
        this.setLado2(lado2);
        this.setLado3(lado3);
    }

    Triangulo(double lado1, double lado2, double lado3, String cor){
        this.setLado1(lado1);
        this.setLado2(lado2);
        this.setLado3(lado3);
        this.setCor(cor);
    }

    void setLado1(double lado1){
        this.lado1 = lado1;
    }

    void setLado2(double lado2){
        this.lado2 = lado2;
    }

    void setLado3(double lado3){
        this.lado3 = lado3;
    }

    @Override
    public double perimetro() {
        return (lado1 + lado2 + lado3);
    }

    @Override
    public double area() {
        double s = (perimetro()/2);
        return (Math.sqrt((s*(s-lado1))*(s-lado2)*(s-lado3)));
    }
}
