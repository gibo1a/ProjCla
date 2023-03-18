package aula06;
import aula05.DateYMD;
import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int cc;
    private DateYMD dataNasc;
    private static ArrayList<Integer> pessoas = new ArrayList<Integer>();

    Pessoa(){
        pessoas.add(this.getCC());
    }
    Pessoa(String nome, int cc, DateYMD dataNasc){
            this.cc = cc;
            this.nome = nome;
            this.dataNasc = dataNasc;
            pessoas.add(this.getCC());
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

    public static ArrayList<Integer> getPessoas(){
        return pessoas;
    }

    @Override
    public String toString() {
        return nome + "; CC: " + cc + "; Data de Nascimento: " + dataNasc.getDay() + "/" + dataNasc.getMonth() + "/" + dataNasc.getYear();
    }

}
