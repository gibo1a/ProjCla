public class DateYMD extends Date implements Comparable<DateYMD> {
    DateYMD(){
    }

    DateYMD(int day, int month, int year){
        this.setDate(day,month,year);
    }

    public void consultDate(){
        System.out.println(this.getDay() + "/" + this.getMonth() + "/" + this.getYear());
    }

    @Override
    public int compareTo(DateYMD o) {
        return Integer.compare(this.getYear(), o.getYear());
    }

    @Override
    public String toString() {
        String data = this.getYear() + "/" + this.getMonth() + "/" + this.getDay();
        return data;
    }
    
}
