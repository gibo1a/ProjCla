package aula05;
import java.util.Scanner;

public class CalendarDemo {
    public static void main(String[] args){
        boolean repetir =  true;
        Scanner sc = new Scanner(System.in);
        int number;
        Calendar calendar = new Calendar();
        while(repetir){
            System.out.println("Calendar operetions:");
            System.out.println("1 - create new calendar");
            System.out.println("2 - print calendar month");
            System.out.println("3 - print calendar");
            System.out.println("0 - exit");
            number = sc.nextInt();
            switch(number){
                case(0):
                    repetir = false;
                    break;
                case(1):
                System.out.println("Insert year");
                int year = sc.nextInt();
                System.out.println("Insert day of the week where the year starts");
                int dayOftheWeek = sc.nextInt();
                calendar.set(year, dayOftheWeek);;
                main(args);
                case(2):
                System.out.println("Insert month");
                int month = sc.nextInt();
                calendar.printMonth(month);
                main(args);
                case(3):
                    break;
            }

    }
    sc.close();
}
}