package aula02;
import java.util.Scanner;


public class Ex4 {
    public static double juros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the invested amount! ");
        double investment = sc.nextDouble();
        System.out.println("Insert the fee tax! ");
        double fees = (sc.nextDouble()/100);
        System.out.println("Insert the number of months! ");
        int months = sc.nextInt();
        double value = investment;
        while (months > 0){
            value += value * fees;
            months--;
        }
        System.out.println("Valor: " + value);
        sc.close();
        return value;
    }

    
}
