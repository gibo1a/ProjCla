public class Plant {
    private String especie;
    private int identifier;
    private double height;
    private int age;
    private String sponsor;

    Plant(String especie, int identifier, double height, int age){
        this.especie = especie;
        this.identifier = identifier;
        this.setAge(age);
        this.setHeight(height);
    }

    Plant(String especie, int identifier, double height, int age, String sponsor){
        this.especie = especie;
        this.identifier = identifier;
        this.setAge(age);
        this.setHeight(height);
        this.setSponsor(sponsor);
    }

    String getEspecie(){
        return especie;
    }

    int getIdentifier(){
        return identifier;
    }

    double getHeigth(){
        return height;
    }

    int getAge(){
        return age;
    }

    String getSponsor(){
        return sponsor;
    }

    void setHeight(double height){
        this.height = height;
    }

    void setAge(int age){
        this.age = age;
    }

    void setSponsor(String sponsor){
        this.sponsor = sponsor;
    }

}
