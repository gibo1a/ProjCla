package aula03;
import java.util.Scanner;
import java.util.Random;

public class Ex3 {
    public static void altoBaixo(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean repetir = false;
        int rand = random.nextInt(101);
        System.out.println("Insira um numero entre 1 e 100");
        int numero = sc.nextInt();
        while(numero < 1 || numero > 100){
            System.out.println("Insira um numero entre 1 e 100");
            numero = sc.nextInt();
        }
        while (repetir){
            rand = random.nextInt(101);
            System.out.println("Insira um numero entre 1 e 100");
            numero = sc.nextInt();
        }
        while(numero != rand){
        if (numero < rand){
            System.out.println("Demasiado baixo! ");
            numero = sc.nextInt();
        }else {
            System.out.println("Demasiado alto! ");
            numero = sc.nextInt();
        }
            }
        System.out.println("Pretende continuar? Prima (S)im.");
        String resposta = sc.next();
        if (resposta == "S" || resposta == "Sim"){
            rand = random.nextInt(101);
            System.out.println("Insira um numero entre 1 e 100");
            numero = sc.nextInt();
        }
        sc.close();
    }
}