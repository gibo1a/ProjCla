package aula03;
import java.util.Scanner;


public class Ex1 {
    public static int sumPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a positive number! ");
        int number = sc.nextInt();
        int sum = 0;
        while(number < 0){
            System.out.println("Number must be positive! ");
            number = sc.nextInt();
        }
        for(int i = 0; i < number; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        sc.close();
        System.out.println(sum);
        return sum;
        
        }

    public static boolean isPrime(int num){
        if(num == 1 || num == 2 || num == 3){
            return true;
        }
        if((num%2) ==0 || (num%3) == 0){
            return false;
        }
        for(int i = 2; i*i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;

    }
}

