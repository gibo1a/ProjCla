package aula03;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Ex4 {
    public static void notasAlunos(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Insira o numero de alunos da turma! ");
        int alunos = sc.nextInt();
        double[][] pauta = new double[alunos][3];
        for(int i = 0;i < pauta.length; i++){
            for(int j = 0;j < 2; j++){
                pauta[i][j] = random.nextDouble()*20.0;
        }
        if(pauta[i][1] < 7 || pauta[1][0] < 7){
            pauta[i][2] = 66;
        }else{
        pauta[i][2] = (0.4 * pauta[i][0]) + (0.6 * pauta[i][1]);
        }
    }
    System.out.printf("NotaT");
    System.out.print(String.format("%10s","NotaP"));
    System.out.println(String.format("%10s","Pauta"));
    for(int i = 0;i < pauta.length; i++){
            System.out.print(String.format("%.1f",pauta[i][0]));
            System.out.print(String.format("%7s",""));
            System.out.print(String.format("%.1f",pauta[i][1]));
            System.out.print(String.format("%7s",""));
            System.out.println(Math.round(pauta[i][2]));
    }
    sc.close();

}

}
