package aula06;
import aula05.DateYMD;

public class Professor extends Pessoa {
    private String categoria;
    private String departamento;
    private DateYMD dataInsc; 

    Professor(String name, int cc,DateYMD dataNasc,DateYMD dataInsc){
        super(name,cc, dataNasc);
        this.dataInsc.setDate(dataInsc.getDay(), dataInsc.getMonth(), dataInsc.getYear());
    }
    Professor(String categoria, String departamento){
        this.categoria = categoria;
        this.departamento = departamento;
    }

    String getCategoria(){
        return categoria;
    }

    String getDepartamento(){
        return departamento;
    }

    DateYMD getdataInsc(){
        return dataInsc;
    }

}
