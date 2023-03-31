public class DateND extends Date{
    private int daydistance = 31;

    DateND(){
    }

    DateND(DateYMD date){
        switch(date.getMonth()){
            case (1):
                this.daydistance = 0;
                this.daydistance = this.daydistance + date.getDay() - 1;
                break;
            case (3):
                if(leapYear(date.getYear())){
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 29 + this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (366 - 29 - this.getDay());
                    }
                }else{
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 28 + this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (365 - 28 - this.getDay());
                    }
                }
                break;
            case (5):
                if(leapYear(date.getYear())){
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 29 + 31 + 30 + this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (366 - 29 - 31 - 30 - this.getDay());
                    }
                }else{
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 28 + 31 + 30+ this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (365 - 28 - 31 - 30 - this.getDay());
                    }
                }
                break;
            case (7):
                if(leapYear(date.getYear())){
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 29 + 31 + 30 + 31 + 30 + this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (366 - 29 - 31 - 30 - 31 - 30 - this.getDay());
                    }
                }else{
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 28 + 31 + 30 + 31 + 30 + this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (365 - 28 - 31 - 30 - 31 - 30 - this.getDay());
                    }
                }
                break;
            case (8):
                if(leapYear(date.getYear())){
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 29 + 31 + 30 + 31 + 30 + 31 + this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (366 - 29 - 31 - 30 - 31 - 30 - 31 - this.getDay());
                    }
                }else{
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 28 + 31 + 30 + 31 + 30 + 31 +this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (365 - 28 - 31 - 30 - 31 - 30 - 31 - this.getDay());
                    }
                }
                break;
            case (10):
                if(leapYear(date.getYear())){
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 29 + 31 + 30 + 31 + 30 + 31 + 30 + this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (366 - 29 - 31 - 30 - 31 - 30 - 31 - 30 - this.getDay());
                    }
                }else{
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 28 + 31 + 30 + 31 + 30 + 31 + 30 +this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (365 - 28 - 31 - 30 - 31 - 30 - 31 - 30 - this.getDay());
                    }
                }
                break;
            case (12):
                if(leapYear(date.getYear())){
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 29 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (366 - 29 - 31 - 30 - 31 - 30 - 31 - 30 - 31 - 30 -this.getDay());
                    }
                }else{
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (365 - 28 - 31 - 30 - 31 - 30 - 31 - 30 - 31 - 30 - this.getDay());
                    }
                }
                break;
            case (4):
                if(leapYear(date.getYear())){
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 29 + 31 + this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (366 - 29 - 31 - this.getDay());
                    }
                }else{
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 28 + 31 + this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (365 - 28 - 31 - this.getDay());
                    }
                }
                break;
            case (6):
                if(leapYear(date.getYear())){
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 29 + 31 + 30 + 31 +this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (366 - 29 - 31 - 30 - 31 - this.getDay());
                    }
                }else{
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 28 + 31 + 30 + 31 +this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (365 - 28 - 31 - 30 - 31 -this.getDay());
                    }
                }
                break;
            case (9):
                if(leapYear(date.getYear())){
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 29 + 31 + 30 + 31 + 30 + 31 + 31 + this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (366 - 29 - 31 - 30 - 31 - 30 - 31 - 31 - this.getDay());
                    }
                }else{
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 28 + 31 + 30 + 31 + 30 + 31 + 31 + this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (365 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - this.getDay());
                    }
                }
                break;
            case (11):
                if(leapYear(date.getYear())){
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (366 - 29 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - this.getDay());
                    }
                }else{
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (365 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - this.getDay());
                    }
                }
                break;
            case (2):
                if(leapYear(date.getYear())){
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 31 + this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (366 - 31 - this.getDay());
                    }
                }else{
                    if(date.getYear() > 2000){
                        this.daydistance = this.daydistance + 31 + this.getDay();
                    }else{
                        this.daydistance = this.daydistance + (365 - 31 - this.getDay());
                    }
                }
                break;
            default:
                break;

        }
    }

    int getDayDistance(){
        return daydistance;
    }
}
