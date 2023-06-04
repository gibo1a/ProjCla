package EPratico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.event.ListDataEvent;

public class CampingService implements CampingServiceInterface{
    private String name;
    private String address;
    private Map<Client,List<Booking>> bookings;
    private List<Client> clients;
    private List<CampingSpace> campingSpaces;

    CampingService(String name, String address){
        this.setName(name);
        this.setAddress(address);
        this.bookings = new HashMap<>();
        this.clients = new ArrayList<>();
        this.campingSpaces = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Map<Client,List<Booking>> getBookings(){
        return bookings;
    }

    public List<Client> getClients(){
        return clients;
    }

    public List<CampingSpace> getCampingSpaces(){
        return campingSpaces;
    }

    @Override
    public Client getClient(int taxId) {
        for(Client c : clients){
            if(c.getConnumber() == taxId){
                return c;
            }else{
                return null;
            }
        }
        return null;
    }

    @Override
    public void addCampingSpace(CampingSpace campingSpace) {
        this.getCampingSpaces().add(campingSpace);
    }

    @Override
    public void addCampingSpaces(Collection<CampingSpace> campingSpaces) {
        this.getCampingSpaces().addAll(campingSpaces);
    }

    @Override
    public boolean registerClient(int taxId, String name, ClientType type) {
        boolean clientisregistered = this.getClients().stream()
                                            .filter(a -> a.getConnumber() == taxId)
                                            .filter(a -> a.getName() == name)
                                            .filter(a -> a.getType() == type)
                                            .collect(Collectors.counting()) == 0;
        if(clientisregistered){
            System.out.println("Client already registered");
        }else{
            this.getClients().add(new Client(name, taxId, type));
        }
        return clientisregistered;
    }

    @Override
    public boolean checkAvailable(CampingSpace campingSpace, LocalDate startDate, LocalDate endDate) {
        Booking reverva = new Booking(startDate, endDate, campingSpace);
        for(List<Booking> l : this.getBookings().values()){
            if(l.contains(reverva)){
                return false;
            }else{
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean bookCampingSpace(Client client, CampingSpace campingSpace, LocalDate startDate, int duration) {
        Booking reverva = new Booking(startDate, startDate, campingSpace);
        if(this.getBookings().get(client).contains(reverva)){
            return false;
        }else{
            this.getBookings().get(client).add(new Booking(startDate, startDate, campingSpace));
            return true;
        }
    }

    @Override
    public double calculateTotalCost(CampingSpace campingSpace, int duration) {
        return campingSpace.getPricePerDay() * duration;
    }

    @Override
    public List<String> listBookings() {
        List<String> books = new ArrayList<>();
        for(List<Booking> l : this.bookings.values()){
            books.addAll(l.stream()
                .map(a -> a.toString())
                .collect(Collectors.toList()));
        }

        return books;
    }

    @Override
    public List<String> listBookings(SpaceType spaceType) {
        List<String> books = new ArrayList<>();
        for(List<Booking> l : this.bookings.values()){
            books.addAll(l.stream()
                .filter(a -> a.getBookinglocation().getType() == spaceType)
                .map(a -> a.toString())
                .collect(Collectors.toList()));
        }

        return books;
    }

    @Override
    public List<CampingSpace> findAvailableCampingSpaces(SpaceType spaceType, LocalDate fromDate, int duration,
            int[] minDimensions) {
        List<CampingSpace> spaces = this.getCampingSpaces().stream()
                                            .filter(a -> a.getType() == spaceType)
                                            .filter(a -> a.getMeasures() == minDimensions)
                                            .collect(Collectors.toList());

        return spaces;
    }




}
