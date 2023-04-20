package aula08;

public class Apesado extends Automovel{
 private double peso;

 Apesado(){}

 Apesado(String matricula, String marca, String modelo, int potencia, int numquadro, double peso){
    super(matricula, marca, modelo, potencia, numquadro);
    this.setPeso(peso);

 }

 public void setPeso(double peso) {
     this.peso = peso;
 }

 public double getPeso() {
     return peso;
 }
    
}
