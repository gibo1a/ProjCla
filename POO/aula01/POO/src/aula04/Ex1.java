package aula04;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
    boolean repetir = true;
    Scanner sc = new Scanner(System.in);
    while(repetir){
        System.out.println("Escolha uma opção!");
        System.out.println("(1) Criar um Circulo");
        System.out.println("(2) Criar um Triangulo");
        System.out.println("(3) Criar um Retangulo");
        int opcao = sc.nextInt();
        switch(opcao){
            case 1:
            System.out.println("Introduza o raio do circulo");
            double radius = sc.nextDouble();
            Circle circulo = new Circle(radius);
            System.out.println(circulo);
            case 2:
            System.out.println("Introduza o valor dos lados do Triangulo");
            System.out.println("Lado1");
            double l1 = sc.nextDouble();
            System.out.println("Lado2");
            double l2 = sc.nextDouble();
            System.out.println("Lado3");
            double l3 = sc.nextDouble();
            Triangle triangulo = new Triangle(l1, l2, l3);
            System.out.println(triangulo);
            case 3:
            System.out.println("Introduza o valor dos lados do Retangulo");
            System.out.println("Comprimento");
            double comp = sc.nextDouble();
            System.out.println("Largura");
            double lar = sc.nextDouble();
            Rectangle retangulo = new Rectangle(comp, lar);
            System.out.println(retangulo);


        }

    }
    sc.close();
}
    
}
