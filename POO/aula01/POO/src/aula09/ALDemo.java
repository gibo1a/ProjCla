package aula09;

import aula06.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

import aula05.DateYMD;
import aula05.dateTime;
import aula06.Pessoa;
public class ALDemo {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<Integer>();
        for (int i = 10; i <= 100; i+=10) 
            c1.add(i);
            System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++) 
            System.out.println("Elemento: " + c1.get(i));
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio"); 
        c2.remove(0);
        System.out.println(c2);

        HashSet<Pessoa> c3 = new HashSet<Pessoa>();
        c3.add(new Pessoa("José", 123456789, new DateYMD(23, 5, 134)));
        c3.add(new Pessoa("Tozé", 987654321, new DateYMD(15, 1, 456)));
        c3.add(new Pessoa("Roberto", 134235634, new DateYMD(2, 2, 2)));
        c3.add(new Pessoa("Otávio", 233447777, new DateYMD(3, 3, 3)));
        c3.add(new Pessoa("Antonio", 333333333, new DateYMD(4, 4, 4)));
        System.out.println(c3);

        TreeSet<Date> c4 = new TreeSet<Date>();
        c4.add(new DateYMD(23, 4, 2345));
        c4.add(new DateYMD(12,5,1345));
        c4.add(new DateYMD(14,7,1456));
        c4.add(new DateYMD(25,12,1234));
        c4.add(new DateYMD(2, 3, 78));


    }
}