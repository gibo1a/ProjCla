public class PalmeTree extends Plant{
    private String habitat;

    PalmeTree(String habitat,String especie, int identifier, double height, int age){
        super(especie,identifier,height,age);
        this.habitat = habitat;

    }

    PalmeTree(String habitat,String especie, int identifier, double height, int age,String sponsor){
        super(especie,identifier,height,age,sponsor);
        this.habitat = habitat;
    }

    String getHabitat(){
        return habitat;
    }
}
