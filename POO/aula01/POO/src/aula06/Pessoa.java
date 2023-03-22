package aula06;
import aula05.DateYMD;
public class Pessoa {
    private String nome;
    private int cc;
    private DateYMD dataNasc;

    Pessoa(){
    }
    Pessoa(String nome, int cc, DateYMD dataNasc){
            this.cc = cc;
            this.nome = nome;
            this.dataNasc = dataNasc;
    }
    String getName(){
        return nome;
    }

    int getCC(){
        return cc;
    }
    
    DateYMD getdataNasc(){
        return dataNasc;
    }

    @Override
    public String toString() {
        return nome + "; CC: " + cc + "; Data de Nascimento: " + dataNasc.getDay() + "/" + dataNasc.getMonth() + "/" + dataNasc.getYear();
    }

}
