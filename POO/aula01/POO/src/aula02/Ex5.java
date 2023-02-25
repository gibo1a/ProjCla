package aula02;
import java.util.Scanner;

public class Ex5 {
    public static void mediumVelocity(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert first trajectory distance! ");
        double distance1 = sc.nextDouble();
        if (distance1 < 0){
            while (distance1 < 0){
                System.out.println("Insert a positive value! ");
                distance1 = sc.nextDouble();
            }
        }
        System.out.println("Insert first trajectory speed! ");
        double speed1 = sc.nextDouble();
        if (speed1 < 0){
            while (speed1 < 0){
                System.out.println("Insert a positive value! ");
                speed1 = sc.nextDouble();
            }
        }
        System.out.println("Insert second trajectory distance! ");
        double distance2 = sc.nextDouble();
        if (distance2 < 0){
            while (distance2 < 0){
                System.out.println("Insert a positive value! ");
                distance2 = sc.nextDouble();
            }
        }
        System.out.println("Insert second trajectory speed! ");
        double speed2 = sc.nextDouble();
        if (speed2 < 0){
            while (speed2 < 0){
                System.out.println("Insert a positive value! ");
                speed2 = sc.nextDouble();
            }
        }
        System.out.println(((speed1 + speed2)/2)/(((distance1 + distance2) / 2)));
        sc.close();

    }
    
}
