package aula05;

class DateYMD{
    private int day;
    private int month;
    private int year;
    DateYMD(){
    }
    DateYMD(int day, int month, int year){
        if (valid(day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
        }else{
            System.out.println("Invalid date! Cannot create object! ");
        }
    }
    static boolean validMonth(int month){
        if (month <= 12 && month > 1){
            return true;
        }else{
            return false;
        }

    }
    int getMonth(){
        return month;
    }

    int getDay(){
        return day;
    }

    int getYear(){
        return year;
    }

    public static int monthDays(int month, int year){
        switch(month){
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                return 31;
            case (4):
            case (6):
            case (9):
            case (11):
                return 30;
            case (2):
                if(leapYear(year)){
                    return 29;
                }else{
                    return 28;
                }
            default:
                return -1;

        }

    }
    public static boolean leapYear(int year){
        if (year%4 == 0 || year%400 == 0){
            if (year%100 != 0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    static boolean valid(int day, int month, int year){
        if(validMonth(month) && year > 0){
            if(day > 0 && day < monthDays(month, year)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        } 
    }
    void setDate(int day, int month, int year){
        if (valid(day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
            System.out.println(this.day + "\n" + this.month + "\n" + this.year);
        }else{
            System.out.println("Invalid date! Cannot set date! ");
        }
    }
    public void consultDate(DateYMD date){
        System.out.println(date.getMonth());
    }
    @Override
    public String toString() {
        String data = year + "/" + month + "/" + day;
        return data;
    }
    public void increment(){
        this.day += 1;
        if(this.day > monthDays(this.month,this.year)){
            this.day = 1;
            this.month += 1;
            if(month > 12){
                this.year += 1;
            }
        }
    }
    public void decrement(){
        this.day -= 1;
        if(this.day  < 1){
            this.month -= 1;
            if(this.month < 1){
                this.year -= 1;
            }
        }
    }
}

