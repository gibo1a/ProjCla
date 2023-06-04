package EPratico;

import java.time.LocalDate;

public class Booking {
    private LocalDate startdate;
    private LocalDate enddate;
    private CampingSpace bookinglocation;

    public Booking(LocalDate startdate,LocalDate enddate,CampingSpace bookinglocation){
        this.setStartdate(startdate);
        this.setEnddate(enddate);
        this.setBookinglocation(bookinglocation);
    }

    public LocalDate getStartdate() {
        return startdate;
    }
    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }
    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    public CampingSpace getBookinglocation() {
        return bookinglocation;
    }
    public void setBookinglocation(CampingSpace bookinglocation) {
        this.bookinglocation = bookinglocation;
    }

    @Override
    public String toString() {
        return this.getBookinglocation() + "" + this.getEnddate() + "" + this.getStartdate();
    }

}
