package aula05;
import java.util.Scanner;

public class dateTime {
    public static void main(String[] args){
        boolean repetir =  true;
        Scanner sc = new Scanner(System.in);
        int number;
        DateYMD date = new DateYMD(1,1,1);
        while(repetir){
            System.out.println("Date operetions:");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("0 - exit");
            number = sc.nextInt();
            switch (number){
                case(1):
                System.out.println("Insert day");
                int day = sc.nextInt();
                System.out.println("Insert month");
                int month = sc.nextInt();
                System.out.println("Insert year");
                int year = sc.nextInt();
                date.setDate(day, month, year);
                main(args);
                case(2):
                    date.consultDate();
                    main(args);
                case(3):
                    date.increment();
                    main(args);
                case(4):
                    date.decrement();
                    main(args);
                case(0):
                    repetir = false;
            }
            
        }
        sc.close();
    }
    
}
