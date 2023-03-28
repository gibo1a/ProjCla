import java.util.ArrayList;

public class ParkManager implements IParkManager{

    private String name;
    private ArrayList<Plant> plants;
    ParkManager(String name){
        this.name = name;
        this.plants = new ArrayList<Plant>();
    }

    @Override
    public void addPlant(Plant plant) {
        this.plants.add(plant);
    }

    @Override
    public void removePlant(Plant plant) {
        for(int i = 0; i < this.plants.size(); i++){
            if(this.plants.get(i) == plant){
                this.plants.remove(i);
            }
        }
    }

    @Override
    public void searchForSpecies(String name) {
        for(int i = 0; i < this.plants.size(); i++){
            if(this.plants.get(i).getEspecie() == name){
                System.out.println(this.plants.get(i));
            }
        }
    }

    @Override
    public boolean sponsorPlant(int plantId) {
        for(int i = 0; i < this.plants.size(); i++){
            if(this.plants.get(i).getIdentifier() == plantId){
                if(this.plants.get(i).getSponsor() != null){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public void listAllPlants() {
        for(int i = 0; i < this.plants.size(); i++){
            System.out.println(this.plants.get(i));

        }
    }

    @Override
    public void listSummarySpecies() {
        int trees = 0;
        int shrubs = 0;
        int palms = 0;
        for(int i = 0; i < plants.size(); i++){
            if(this.plants.get(i) instanceof Tree){
                trees++;
            }else if(this.plants.get(i) instanceof Shrub){
                shrubs++;
            }else{
                palms++;
            }

        }

        System.out.println("Trees : " + trees + "\n" + "Shrubs : " + shrubs + "\n" + "PalmTrees" + palms);
    }

    String getParkName(){
        return name;
    }

    ArrayList<Plant> getPlants(){
        return plants;
    }



    
}
