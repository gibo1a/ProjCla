package aula02;
import java.util.Scanner;
import java.lang.Math;

public class Ex7 {
    public static void distance(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza as coordenadas do ponto 1! ");
        System.out.println("x1? ");
        double x1 = sc.nextDouble();
        System.out.println("y1? ");
        double y1 = sc.nextDouble();
        System.out.println("Introduza as coordenadas do ponto 2! ");
        System.out.println("x2? ");
        double x2 = sc.nextDouble();
        System.out.println("y2? ");
        double y2 = sc.nextDouble();
        System.out.println(Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 + y2),2)));
        sc.close();

    }

    
}
