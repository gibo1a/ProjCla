package aula06;
import aula05.DateYMD;

public class Ex1 {
    public static void main(String[] args) {
       Aluno al = new Aluno("Andreia Melo", 9855678, new DateYMD(18, 7, 1990), new DateYMD(1, 9, 2018));
      // Professor pl = new Professor("Andreia Melo", 9855678,new DateYMD(18, 7, 1990), new DateYMD(1, 9, 2018));
       Bolseiro bls = new Bolseiro ("Igor Santos", 8976543, new DateYMD(11, 5, 1985), new Professor("gigig",1111111,new DateYMD(18, 7, 1990),new DateYMD(1, 9, 2018)), 900);
       bls.setBolsa(1050);
       System.out.println("Aluno: " + al.getName());
       System.out.println(al);
       System.out.println("Bolseiro: " + bls.getName() + ", NMec: " + bls.getNMec() + ", Bolsa: " + bls.getBolsa() + ", Orientador: " + bls.getOrientador());
       System.out.println(bls);
       System.out.println(Pessoa.getPessoas());
        }
       }
