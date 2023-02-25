package aula02;
import java.util.Scanner;

public class Ex2 {
    public static void toFahrenheit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter degrees ? ");
        double celsius = sc.nextDouble();
        double fahrenheit = (1.8 * celsius) + 32;
        System.out.println(fahrenheit);
        sc.close();
    }

    
}
