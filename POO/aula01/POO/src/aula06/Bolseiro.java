package aula06;
import aula05.DateYMD;

public class Bolseiro extends Aluno {
    private Professor profOrientador;
    private double bolsa;

    Bolseiro(Professor prof, double bolsa){
        this.profOrientador = prof;
        this.bolsa = bolsa;
    }

    Bolseiro(String nome, int cc, DateYMD dataNasc,Professor prof, double bolsa){
        super(nome, cc, dataNasc);
        this.profOrientador = prof;
        this.bolsa = bolsa;
    }

    Professor getOrientador(){
        return profOrientador;
    }

    double getBolsa(){
        return bolsa;
    }

    void setOrientator(Professor prof){
        this.profOrientador = prof;
    }

    void setBolsa(double bolsa){
        this.bolsa = bolsa;
    }
}
