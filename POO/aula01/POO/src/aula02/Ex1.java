package aula02;
import java.util.Scanner;

public class Ex1 {
    public static void toMiles() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of kilometers ? ");
        double kilometers = sc.nextFloat();
        double miles = (kilometers * 1.609);
        System.out.println(miles);
        sc.close();
    }
    
}
