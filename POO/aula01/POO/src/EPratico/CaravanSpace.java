package EPratico;

public class CaravanSpace extends CampingSpace{
    final public static double maxDuration = 3*365;
    final public static SpaceType type = SpaceType.CARAVANSPACE;

    public CaravanSpace(String location, int[] measures, double pricePerDay){
        super(location,measures,pricePerDay);
    }

    public static double getMaxduration() {
        return maxDuration;
    }


}
