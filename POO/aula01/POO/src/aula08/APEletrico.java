package aula08;

public class APEletrico extends Apesado implements VeiculoEletrico{
    private int auto;

    APEletrico(){}

    APEletrico(String matricula, String marca, String modelo, int potencia, int numquadro, double peso, int auto){
        super(matricula, marca, modelo, potencia, numquadro, peso);
        this.setAuto(auto);
    }

    public void setAuto(int auto) {
        this.auto = auto;
    }

    public int getAuto() {
        return auto;
    } 

    @Override
    public int autonomia() {
        return this.getAuto() - this.distanciaTotal();
    }

    @Override
    public void carregar(int percentagem) {
        System.err.println("Carregando " + percentagem + "%");
    }
}
