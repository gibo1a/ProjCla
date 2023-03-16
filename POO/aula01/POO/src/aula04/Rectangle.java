package aula04;

public class Rectangle {
    private double comprimento;
    private double largura;
    Rectangle(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }
    public double areaRetangulo(){
        return (comprimento * largura);
    }

    public double perimetroRetengulo(){
        return ((2*comprimento) + (2*largura));
    }

}
