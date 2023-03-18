package aula06;
import aula05.DateYMD;

public class Pessoa {
    private String nome;
    private int cc;
    private DateYMD dataNasc;

    Pessoa(){
    }
    Pessoa(String nome, int cc, DateYMD dataNasc){
        this.nome = nome;
        this.dataNasc = dataNasc;
        if(cc > 9999999 && cc < 10000000){
            this.cc = cc;
        }else{
            System.out.println("Introduza um número válido!");
        }
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
        return nome + "; CC: " + cc + "; Datad de Nascimento: " + dataNasc.getDay() + "/" + dataNasc.getMonth() + "/" + dataNasc.getYear();
    }

}