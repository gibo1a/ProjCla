package aula09;

public class CommercialPlane extends Plane{
    private int passangers;

    public CommercialPlane(String id, String manufacturer, String model, int productionyear, int maspassangers , int setMaxspeed){
        super(id, manufacturer, model, productionyear, maspassangers, setMaxspeed);
        this.setMaxpassangers(maspassangers);
    }

    public void setPassangers(int passangers) {
        this.passangers = passangers;
    }

    public int getPassangers() {
        return passangers;
    }
    
    @Override
    public String toString() {
        return super.toString() + "";
    }
    
    @Override
    public String getPlaneType() {
        return "Commercial";
    }
}
