public class Retangulo extends Forma{
    private double comprimento;
    private double largura;

    Retangulo(){
    }

    Retangulo(double comprimento, double largura){
        this.setComprimento(comprimento);
        this.setLargura(largura);
    }

    Retangulo(double comprimento, double largura,String cor){
        this.setComprimento(comprimento);
        this.setLargura(largura);
        this.setCor(cor);
    }

    double getLargura(){
        return largura;
    }

    double getComprimento(){
        return comprimento;
    }

    private void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }

    private void setLargura(double largura){
        this.largura = largura;
    }

    @Override
    public double area() {
        return (comprimento * largura);
    }

    @Override
    public double perimetro() {
        return ((2*comprimento) + (2*largura));
    }
    
}
