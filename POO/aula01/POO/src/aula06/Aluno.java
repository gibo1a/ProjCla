package aula06;
import aula05.DateYMD;

public class Aluno extends Pessoa {
    private int mecnumber = 100;
    private DateYMD dataInsc;

    Aluno(){
    }

    Aluno(String iNome, int iBI, DateYMD iDataNasc){
        super(iNome,iBI,iDataNasc);
        this.dataInsc = new DateYMD(18,3,2023);
        this.mecnumber = mecnumber + 1;
        mecnumber++;
    }
    Aluno(String iNome, int iBI, DateYMD iDataNasc, DateYMD iDataInsc){
        super(iNome,iBI,iDataNasc);
        this.dataInsc = iDataInsc;
        this.mecnumber = mecnumber + 1;
        mecnumber++;
    }

    int getNMec(){
        return mecnumber;
    }

    DateYMD getDataInsc(){
        return dataInsc;
    }
    
} 

