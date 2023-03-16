package aula02;
import java.util.Scanner;

public class Ex10 {
    public static void listofNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number! ");
        double n = sc.nextDouble();
        System.out.println("Insert a number! ");
        double numbers = sc.nextDouble();
        double max = 0;
        double min = numbers;
        double sum = 0;
        int count = 2;
        while(numbers != n){
            System.out.println("Insert a number! ");
            numbers = sc.nextDouble();
            if(numbers < min){
                min = numbers;
            }
            if(numbers > max){
                max = numbers;
            }
            sum += numbers;
            count += 1;



        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Total of numbers: " + count);
        sc.close();



    }
    
}
