public class Shrub extends Plant{
    private boolean flower;
    private String flowerColor;

    Shrub(boolean flower,String especie, int identifier, double height, int age){
        super(especie,identifier,height,age);
        this.flower = flower;
    }

    Shrub(boolean flower,String especie, int identifier, double height, int age,String sponsor){
        super(especie,identifier,height,age,sponsor);
        this.flower = flower;
    }

    Shrub(boolean flower,String flowerColor ,String especie, int identifier, double height, int age){
        super(especie,identifier,height,age);
        this.flower = flower;
        if (flower){
            this.flowerColor = flowerColor;
        }else{
            System.out.println("Shrub doesnt have flowers!!");
        }
    }

    Shrub(boolean flower,String flowerColor ,String especie, int identifier, double height, int age,String sponsor){
        super(especie,identifier,height,age,sponsor);
        this.flower = flower;
        if (flower){
            this.flowerColor = flowerColor;
        }else{
            System.out.println("Shrub doesnt have flowers!!");
        }
    }

    boolean hasFlower(){
        return flower;
    }

    String getFlowerColor(){
        return flowerColor;
    }
    
}
