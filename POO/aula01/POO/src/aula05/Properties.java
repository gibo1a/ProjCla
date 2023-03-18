package aula05;

public class Properties {
    int seqNumber;
    int rooms;
    String local;
    double price;
    boolean availability;
    DateYMD auctionStart;
    int duration;

    Properties(){
    }

    Properties(String local,int rooms, int price){
        this.rooms = rooms;
        this.local = local;
        this.price = price;
    }

    Properties(int seqNumber, int rooms, String local, double price, boolean availability,DateYMD auctionStart, int duration){
        this.seqNumber = seqNumber;
        this.rooms = rooms;
        this.local = local;
        this.price = price;
        this.availability = availability;
        this.auctionStart = auctionStart;
        this.duration = duration;
    }

    void setDates(DateYMD auctionStart,int time){
        this.duration = time;
        this.auctionStart = auctionStart;
    }

    void setAvailability(boolean availability){
        this.availability = availability;
    }

    void setNumber(int seqNumber){
        this.seqNumber = seqNumber;
    }

    int getSeqnumber(){
        return seqNumber;
    }

    int getRooms(){
        return rooms;
    }

    String getLocal(){
        return local;
    }

    double getPrice(){
        return price;
    }

    String getAvailability(){
        if(availability == true){
            return "sim";
        }else{
            return "não";
        }
    }

    DateYMD getDate(){
        return auctionStart;
    }
}
