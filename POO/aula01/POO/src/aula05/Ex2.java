package aula05;

class Calendar {
    private int year;
    private int dayOftheWeek;
    private String[][] calendar;
    Calendar(){
    }
    Calendar(int year, int dayOftheWeek){
        if(dayOftheWeek <= 7 && dayOftheWeek >= 1){
            this.dayOftheWeek = dayOftheWeek;
        }else{
            System.out.println("Day of the weak must be an positive number between 1 and 7! ");
        }
        if (year >= 0){
            this.year = year;
        }else{
            System.out.println("Year must be a positive number! ");
        }
        String[][] calendar = new String[12][31];
        for(int i = 0; i < calendar.length; i++){
            for(int j = 0; j < 31 ;j++){
                calendar[i][j] = Integer.toString(j + 1);
            }
        }
        this.calendar = calendar;
    }

    int year(){
        return this.year;
    }

    int firstWeekdayOfYear(int month){
        return this.dayOftheWeek;
    }

    int firstWeekdayOfMonth(int month){
        if(month == 1){
            return this.dayOftheWeek;
        }else if(month >= 1 && month <= 12){
            return 1;

        }else{
            return -1;
        }
    }

    void addEvent(DateYMD date){ 
        calendar[date.month()][date.day()] += "*";
    }   

    void removeEvent(DateYMD date){
        calendar[date.month()][date.day()].replace("*", "");
    }
    void set(int year, int dayOftheWeek){
        if(dayOftheWeek <= 7 && dayOftheWeek >= 1){
            this.dayOftheWeek = dayOftheWeek;
        }else{
            System.out.println("Day of the weak must be an positive number between 1 and 7! ");
        }
        if (year >= 0){
            this.year = year;
        }else{
            System.out.println("Year must be a positive number! ");
        }
    }

    void printMonth(int month){
        int first = this.firstWeekdayOfMonth(month);
        switch(month){
            case(1):
                System.out.print(String.format("%10s","Jannuary"));
                System.out.println(String.format("%5d",this.year));
                break;
            case(3):
                System.out.print(String.format("%10s","March"));
                System.out.println(String.format("%5d",this.year));
                break;
            case(5):
                System.out.print(String.format("%10s","May"));
                System.out.println(String.format("%5d",this.year));
                break;
            case(7):
                System.out.print(String.format("%10s","July"));
                System.out.println(String.format("%5d",this.year));
                break;
            case(8):
                System.out.print(String.format("%10s","August"));
                System.out.println(String.format("%5d",this.year));
                break;
            case(10):
                System.out.print(String.format("%10s","October"));
                System.out.println(String.format("%5d",this.year));
                break;
            case(12):
                System.out.print(String.format("%10s","December"));
                System.out.println(String.format("%5d",this.year));
                break;
            case(4):
                System.out.print(String.format("%10s","April"));
                System.out.println(String.format("%5d",this.year));
                break;
            case(6):
                System.out.print(String.format("%10s","June"));
                System.out.println(String.format("%5d",this.year));
                break;
            case(9):
                System.out.print(String.format("%10s","September"));
                System.out.println(String.format("%5d",this.year));
                break;
            case(11):
                System.out.print(String.format("%10s","November"));
                System.out.println(String.format("%5d",this.year));
                break;
            case(2):
                System.out.print(String.format("%10s","February"));
                System.out.println(String.format("%5d",year));
                break;
            default:
                break;
        }
        System.out.printf("%5s","Su");
        System.out.printf("%5s","Mo");
        System.out.printf("%5s","Tu");
        System.out.printf("%5s","We");
        System.out.printf("%5s","Th");
        System.out.printf("%5s","Fr");
        System.out.printf("%5s","Sa");
        System.out.println();
        switch(first){ 
            case(1):
                System.out.print(String.format("%4d",calendar[0][0]));
                for(int i = 0; i < DateYMD.monthDays(month, this.year) + 1;i++){
                    System.out.print(String.format("%3d",calendar[month][i]));
                    i++;
                    System.out.print(String.format("%3d",calendar[month][i]));
                    i++;
                    System.out.print(String.format("%3d",calendar[month][i]));
                    i++;
                    System.out.print(String.format("%3d",calendar[month][i]));
                    i++;
                    System.out.println(String.format("%3d",calendar[month][i]));
                    i++;
                    System.out.print(calendar[month][i]);
                    i++;
                    System.out.print(String.format("%3d",calendar[month][i]));
                }
                break;
            case(2):
                System.out.print(String.format("%7d",calendar[0][0]));
                for(int i = 1; i < DateYMD.monthDays(month, this.year) + 1;i++){
                    System.out.print(String.format("%3d",calendar[month][i]));
                    i++;
                    System.out.print(String.format("%3d",calendar[month][i]));
                    i++;
                    System.out.print(String.format("%3d",calendar[month][i]));
                    i++;
                    System.out.println(String.format("%3d",calendar[month][i]));
                    i++;
                    System.out.print(calendar[month][i]);
                    i++;
                    System.out.print(String.format("%3d",calendar[month][i]));
                    i++;
                    System.out.print(String.format("%3d",calendar[month][i]));
                }
                break;
            case(3):
                System.out.print(String.format("%10d",calendar[0][0]));
                for(int i = 1; i < DateYMD.monthDays(month, this.year) + 1;i++){
                    System.out.print(String.format("%3d",calendar[month][i]));
                    i++;
                    System.out.print(String.format("%3d",calendar[month][i]));
                    i++;
                    System.out.println(String.format("%3d",calendar[month][i]));
                    i++;
                    System.out.print(calendar[month][i]);
                    i++;
                    System.out.print(String.format("%3d",calendar[month][i]));
                    i++;
                    System.out.print(String.format("%3d",calendar[month][i]));
                    i++;
                    System.out.print(String.format("%3d",calendar[month][i]));
            }
            break;
        case(4):
            System.out.print(String.format("%10d",calendar[0][0]));
            for(int i = 1; i < DateYMD.monthDays(month, this.year) + 1;i++){
                System.out.print(String.format("%3d",i));
                i++;
                System.out.print(String.format("%3d",i));
                i++;
                System.out.println(String.format("%3d",i));
                i++;
                System.out.print(i);
                i++;
                System.out.print(String.format("%3d",i));
                i++;
                System.out.print(String.format("%3d",i));
                i++;
                System.out.print(String.format("%3d",i));
            }
            break;
        case(5):
            System.out.print(String.format("%16d",calendar[0][0]));
            for(int i = 1; i < DateYMD.monthDays(month, this.year) + 1;i++){
                System.out.println(String.format("%3d",calendar[month][i]));
                i++;
                System.out.print(calendar[month][i]);
                i++;
                System.out.print(String.format("%3d",calendar[month][i]));
                i++;
                System.out.print(String.format("%3d",calendar[month][i]));
                i++;
                System.out.print(String.format("%3d",calendar[month][i]));
                i++;
                System.out.print(String.format("%3d",calendar[month][i]));
                i++;
                System.out.print(String.format("%3d",calendar[month][i]));
            }
            break;
        case(6):
            System.out.println(String.format("%19d",calendar[0][0]));
            for(int i = 1; i < DateYMD.monthDays(month, this.year) + 1;i++){
                System.out.print(calendar[month][i]);
                i++;
                System.out.print(String.format("%3d",calendar[month][i]));
                i++;
                System.out.print(String.format("%3d",calendar[month][i]));
                i++;
                System.out.print(String.format("%3d",calendar[month][i]));
                i++;
                System.out.print(String.format("%3d",calendar[month][i]));
                i++;
                System.out.print(String.format("%3d",calendar[month][i]));
                i++;
                System.out.println(String.format("%3d",calendar[month][i]));
            }
            break;
        case(7):
            System.out.print(calendar[0][0]);
            for(int i = 1; i < DateYMD.monthDays(month, this.year) + 1;i++){
                System.out.print(String.format("%3d",calendar[month][i]));
                i++;
                System.out.print(String.format("%3d",calendar[month][i]));
                i++;
                System.out.print(String.format("%3d",calendar[month][i]));
                i++;
                System.out.print(String.format("%3d",calendar[month][i]));
                i++;
                System.out.print(String.format("%3d",calendar[month][i]));
                i++;
                System.out.println(String.format("%3d",calendar[month][i]));
                i++;
                System.out.print(calendar[month][i]);
            }
            break;


    }
}
}
