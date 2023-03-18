package aula05;
import java.util.ArrayList;

public class RealEstate {
    ArrayList<Properties> properties;
    RealEstate(){
       this.properties = new ArrayList<Properties>();
    }
    void newProperty(String name, int room, int price){
        Properties property = new Properties(name,room,price);
        property.setAvailability(true);
        properties.add(property);
        property.setNumber(1000 + properties.indexOf(property));
    }
    void setAuction(int number, DateYMD auction, int duration){
        if(checkNumber(number)){
            for(int i = 0;i < properties.size();i++){
                if(properties.get(i).getSeqnumber() == number){
                    properties.get(i).setDates(auction, duration);
                    if(properties.get(i).getAvailability() == "não"){
                        System.out.println("Imóvel " + properties.get(i).getSeqnumber() + " não está disponível.");
                    }
                }else{
                    continue;
                }
            }
        }else{
            System.out.println("Imóvel " + number + " não existe.");
        }
    }

    void sell(int seqNumber){
        for(int i = 0; i < properties.size();i++){
            if(properties.get(i).getSeqnumber() == seqNumber){
                properties.get(i).setAvailability(false);
                System.out.println("Imóvel "+ seqNumber + " vendido.");
            }
        }
    }

    boolean checkNumber(int number){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0;i < properties.size();i++){
            numbers.add(properties.get(i).getSeqnumber());
        }
        if(numbers.contains(number)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Propriedades:" + "\n" + "Imóvel: " + properties.get(0).getSeqnumber() + ";" + " quartos: " + properties.get(0).getRooms() + ";" + " localidade: "  + properties.get(0).getLocal() + ";" + " preço: " + properties.get(0).getPrice() + ";" + " disponível: " + properties.get(0).getAvailability() + "\n" + "Imóvel: " + properties.get(1).getSeqnumber() + ";" + " quartos: " + properties.get(1).getRooms() + ";" + " localidade: "  + properties.get(1).getLocal() + ";" + " preço: " + properties.get(1).getPrice() + ";" + " disponível: " + properties.get(1).getAvailability() + "\n" + "Imóvel: " + properties.get(2).getSeqnumber() + ";" + " quartos: " + properties.get(2).getRooms() + ";" + " localidade: "  + properties.get(2).getLocal() + ";" + " preço: " + properties.get(2).getPrice() + ";" + " disponível: " + properties.get(2).getAvailability() + "; leilão " + properties.get(2).getDate() + "\n" + "Imóvel: " + properties.get(3).getSeqnumber() + ";" + " quartos: " + properties.get(3).getRooms() + ";" + " localidade: "  + properties.get(3).getLocal() + ";" + " preço: " + properties.get(3).getPrice() + ";" + " disponível: " + properties.get(3).getAvailability() + "; leilão " + properties.get(3).getDate() + "\n" + "Imóvel: " + properties.get(4).getSeqnumber() + ";" + " quartos: " + properties.get(4).getRooms() + ";" + " localidade: "  + properties.get(4).getLocal() + ";" + " preço: " + properties.get(4).getPrice() + ";" + " disponível: " + properties.get(4).getAvailability();
    }
}
