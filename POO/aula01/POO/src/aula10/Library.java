package aula10;

import java.util.LinkedHashMap;
import java.util.LinkedList;


public class Library {
    private LinkedHashMap<Genr,LinkedList<Book>> mapa;
    public Library(){
        this.mapa = new LinkedHashMap<Genr,LinkedList<Book>>();
    }

    public LinkedHashMap<Genr, LinkedList<Book>> getMapa(){
        return mapa;
    }
    public static void main(String[] args) {
        Library livraria = new Library();
        livraria.getMapa().put(Genr.Aventura,new LinkedList<Book>());
        livraria.getMapa().put(Genr.Drama,new LinkedList<Book>());
        livraria.getMapa().put(Genr.Terror,new LinkedList<Book>());
        livraria.getMapa().put(Genr.Policial,new LinkedList<Book>());
        livraria.getMapa().put(Genr.Romance,new LinkedList<Book>());

        livraria.getMapa().get(Genr.Aventura).add(new Book("Ola", "Ze", 190));
        System.out.println(livraria.getMapa().get(Genr.Aventura).get(0));
    }

}