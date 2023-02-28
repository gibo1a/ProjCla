package aula03;
import java.util.Scanner;
import java.util.Random;

public class Ex4 {
    public static void notasAlunos(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Insira o numero de alunos da turma! ");
        int alunos = sc.nextInt();
        float[][] pauta = new float[alunos][2];
        for(int i = 0;i <= 2; i++){
            for(int j = 0; j < pauta.length; j++){
                alunos[i][j] = random.nextDouble(20.0);
            }
        }

    }
    
}
