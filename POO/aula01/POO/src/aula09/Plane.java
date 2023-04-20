package aula09;

public class Plane {
    private String id, manufacturer, model;
    private int productionyear, maxpassangers, maxspeed;

    public Plane(String id, String manufacturer, String model, int productionyear, int maspassangers , int setMaxspeed){
        this.setId(id);
        this.setManufacturer(manufacturer);
        this.setModel(model);
        this.setProductionyear(productionyear);
        this.setMaxpassangers(maspassangers);
        this.setMaxspeed(setMaxspeed);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProductionyear(int productionyear) {
        this.productionyear = productionyear;
    }

    public void setMaxpassangers(int maxpassangers) {
        this.maxpassangers = maxpassangers;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getProductionyear() {
        return productionyear;
    }

    public int getMaxpassangers() {
        return maxpassangers;
    }

    public int getMaxspeed() {
        return maxspeed;
    }




    
}
