package EPratico;

public class CampingSpace implements TypeInterface{
    private String location;
    private int[] measures;
    private double pricePerDay;
    private SpaceType type;


    public CampingSpace(String location, int[] measures, double pricePerDay){
        this.setLocation(location);
        this.setPricePerDay(pricePerDay);
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public int[] getMeasures(){
        return measures;
    }

    public void setMeasures(int[] measures){
        this.measures = measures;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }
    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public SpaceType getType() {
        return type;
    }

}
