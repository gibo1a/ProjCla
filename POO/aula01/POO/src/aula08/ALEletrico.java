package aula08;

public class ALEletrico extends Aligeiro implements VeiculoEletrico{
    private int auto;

    ALEletrico(){}

    ALEletrico(String matricula, String marca, String modelo, int potencia, int numquadro, int capbag, int auto){
        super(matricula, marca, modelo, potencia, numquadro, capbag);
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
