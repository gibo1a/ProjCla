package aula03;
import java.util.Scanner;

public class Ex2 {
    public static double juros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the invested amount! ");
        int investment = sc.nextInt();
        while(investment < 0 && investment%100 != 0){
            System.out.println("Insert the invested amount! ");
            investment = sc.nextInt();
        }
        System.out.println("Insert the fee tax! ");
        double fees = (sc.nextDouble()/100);
        while(fees < 0 || fees > 5){
            System.out.println("Insert the fee tax! ");
            fees = (sc.nextDouble()/100);
        }
        System.out.println("Insert the number of months! ");
        int months = sc.nextInt();
        double value = investment;
        while (months > 0){
            value += value * fees;
            System.out.println(value);
            months--;
        }
        System.out.println("Valor: " + value);
        sc.close();
        return value;
    }

    
}
