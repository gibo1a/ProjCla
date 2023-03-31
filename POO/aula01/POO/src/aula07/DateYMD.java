public class DateYMD extends Date {
    DateYMD(){
    }

    DateYMD(int day, int month, int year){
        this.setDate(day,month,year);
    }

    public void consultDate(){
        System.out.println(this.getDay() + "/" + this.getMonth() + "/" + this.getYear());
    }

    @Override
    public String toString() {
        String data = this.getYear() + "/" + this.getMonth() + "/" + this.getDay();
        return data;
    }
    
}
