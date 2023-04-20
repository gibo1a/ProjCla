package aula06;

public class Contactos {
    private int id;
    private static int nextid = 1;
    private Pessoa owner;
    private int contact;
    private String email;

    Contactos(Pessoa owner, int contact){
        if(contact < 1000000000 && contact > 899999999){
            this.contact = contact;
        }else{
            System.out.println("Insert a valid contact number! ");
        }
        this.owner = owner;
        this.id = nextid;
        nextid ++;
    }

    Contactos(Pessoa owner, String email){
        String[] em = email.split(".");
        if(email.contains("@")){
            if(em[em.length - 1] instanceof String){
                this.email = email;
            }
        }else{
            System.out.println("Introduce a valid email!");
        }
        this.owner = owner;
        this.id = nextid;
        nextid ++;

    }
    
    Contactos(Pessoa owner, int contact, String email){
        String[] em = email.split(".");
        if(contact < 1000000000 && contact > 899999999){
            this.contact = contact;
        }else{
            System.out.println("Insert a valid contact number! ");
        }
        if(email.contains("@")){
            if(em[em.length - 1] instanceof String){
                this.email = email;
            }
        }else{
            System.out.println("Introduce a valid email!");
        }
        this.owner = owner;
        this.id = nextid;
        nextid ++;
    }

    int getID(){
        return id;
    }

    Pessoa getOwner(){
        return owner;
    }

    String getEmail(){
        return email;
    }

    int getContact(){
        return contact;
    }

    void setOwner(Pessoa person){
        this.owner = person;
    }

    void changeID(){
        
    }

}
