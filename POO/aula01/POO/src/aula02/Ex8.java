package aula02;
import java.util.Scanner;
import java.lang.Math;

public class Ex8 {
    public static void triangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza o valor do cateto A! ");
        double catetoA = sc.nextDouble();
        if (catetoA < 0){
            System.out.println("Introduza um valor positivo! ");
            catetoA = sc.nextDouble();
        }
        System.out.println("Introduza o valor do cateto B! ");
        double catetoB = sc.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        double angulo = (1/(catetoA/hipotenusa));
        System.out.println("Hipotnusa: " + hipotenusa);
        System.out.println("Angulo: " + angulo);
        sc.close();

    }

    
}
