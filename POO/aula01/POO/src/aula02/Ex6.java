package aula02;
import java.util.Scanner;

public class Ex6 {
    public static void showTime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert time! ");
        int time = sc.nextInt();
        int hours = time / 3600;
        int minutes = (((time % 3600)/60));
        int seconds = (time - ((hours * 3600) + (minutes * 60)));
        System.out.println(hours + ":" + minutes + ":" + seconds);
        sc.close();
    }
    
}
