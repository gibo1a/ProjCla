package EPratico;


public class Client{
    private String name;
    private int connumber;
    private ClientType socio;

    public Client(String name, int connumber, ClientType socio){
        this.setName(name);
        this.setConnumber(connumber);
        this.setType(socio);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getConnumber() {
        return connumber;
    }
    public void setConnumber(int connumber) {
        this.connumber = connumber;
    }

    public ClientType getType() {
        return socio;
    }
    public void setType(ClientType socio) {
        this.socio = socio;
    }

    @Override
    public String toString() {
        return "Name :" + this.getName() + "\n" + "ConNumber :" + this.getConnumber() + "\n" + "Socio :" + this.getType();
    }

}