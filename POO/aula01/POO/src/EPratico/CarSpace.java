package EPratico;

public class CarSpace extends CampingSpace{
    final public static double maxDuration = 3*30;
    final public static SpaceType type = SpaceType.CARSPACE;

    public CarSpace(String location, int[] measures, double pricePerDay){
        super(location,measures,pricePerDay);
    }

    public static double getMaxduration() {
        return maxDuration;
    }
}
