import java.lang.Math;
public class Triangulo extends Forma{
    private double cateto1;
    private double cateto2;
    private double hipotnusa;

    Triangulo(){
    }

    Triangulo(double cateto1, double cateto2){
        this.setCateto1(cateto1);
        this.setCateto2(cateto2);
        this.hipotnusa = Math.sqrt((Math.pow(this.getCateto1(),2) + Math.pow(this.getCateto1(), 2)));
    }

    Triangulo(double cateto1, double cateto2, String cor){
        this.setCateto1(cateto1);
        this.setCateto2(cateto2);
        this.setCor(cor);
        this.hipotnusa = Math.sqrt((Math.pow(this.getCateto1(),2) + Math.pow(this.getCateto1(), 2)));
    }

    void setCateto1(double cateto1){
        this.cateto1 = cateto1;
    }

    void setCateto2(double cateto2){
        this.cateto2 = cateto2;
    }

    @Override
    public double perimetro() {
        return (this.getCateto1() + this.getCateto2() + this.getHipotnusa());
    }

    @Override
    public double area() {
        double s = (perimetro()/2);
        return (Math.sqrt((s*(s-this.getCateto1())*(s-this.getCateto2())*(s-this.getHipotnusa()))));
    }

    double getCateto1(){
        return cateto1;
    }

    double getCateto2(){
        return cateto2;
    }

    double getHipotnusa(){
        return hipotnusa;
    }


    public boolean equals(Triangulo triangulo){
        if(this.getCor() == triangulo.getCor()){
            if(this.getCateto1() == triangulo.getCateto1() && triangulo.getCateto2() == this.getCateto2()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
