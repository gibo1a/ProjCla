package aula08;

import java.util.ArrayList;

public class Rental {
    private String name;
    private String postal;
    private String email;
    private ArrayList<Veiculo> stock;

    Rental(){}

    Rental(String name, String postal, String email){
        this.setName(name);
        this.setPostal(postal);
        this.setEmail(email);
        this.stock = new ArrayList<Veiculo>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPostal() {
        return postal;
    }

    public ArrayList<Veiculo> getStock() {
        return stock;
    }
}
