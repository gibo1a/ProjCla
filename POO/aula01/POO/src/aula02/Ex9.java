package aula02;
import java.util.Scanner;

public class Ex9 {
    public static void countdown(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number! ");
        int number = sc.nextInt();
        while(number > 0){
            if((number % 10) == 0){
                System.out.println(number);
            }else{
                System.out.print(number);
                System.out.print(",");
            }
            number--;
        }
        sc.close();


    }


    
}
