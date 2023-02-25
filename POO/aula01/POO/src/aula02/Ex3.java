package aula02;
import java.util.Scanner;

public class Ex3 {
    public static void energy(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de agua! ");
        double agua = sc.nextDouble();
        System.out.println("Insira a temperatura inicial! ");
        double tempinicial = sc.nextDouble();
        System.out.println("Insira a temperatura final! ");
        double tempfinal = sc.nextDouble();
        double energia = (agua * (tempfinal - tempinicial) * 4184);
        System.out.println("Energia: " + energia);
        sc.close();
    }
    
}
