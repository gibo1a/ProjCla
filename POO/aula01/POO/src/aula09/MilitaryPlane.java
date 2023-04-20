package aula09;

public class MilitaryPlane extends Plane{
    private int ammo;

    public MilitaryPlane(String id, String manufacturer, String model, int productionyear, int maspassangers , int setMaxspeed, int ammo){
        super(id, manufacturer, model, productionyear, maspassangers, setMaxspeed);
        this.setAmmo(ammo);

    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getAmmo() {
        return ammo;
    }

    @Override
    public String toString() {
        return super.toString() + "Ammo: " + this.getAmmo();
    }

    @Override
    public String getPlaneType() {
        return "Military";
    }
}
