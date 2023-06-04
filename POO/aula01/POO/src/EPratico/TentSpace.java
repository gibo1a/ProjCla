package EPratico;

public class TentSpace extends CampingSpace{
    final public static double maxDuration = 15;
    final public static SpaceType type = SpaceType.TENTSPACE;

    public TentSpace(String location, int[] measures, double pricePerDay){
        super(location,measures,pricePerDay);
    }

    public static double getMaxduration() {
        return maxDuration;
    }
}
