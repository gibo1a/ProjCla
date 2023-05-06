package aula10;

import java.util.LinkedHashMap;
import java.util.LinkedList;


public class Library {
    LinkedHashMap<Genr,LinkedList<Book>> mapa;
    public Library(){
        this.mapa = new LinkedHashMap<Genr,LinkedList<Book>>();
    }
}
