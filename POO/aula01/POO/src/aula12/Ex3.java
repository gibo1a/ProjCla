package aula12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Ex3 {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        try{
            Scanner fr = new Scanner(new FileReader("C:/Users/gabib/Desktop/ProjCla/POO/aula01/POO/src/aula12/movies.txt"));
            fr.nextLine();
            while(fr.hasNext()){
                String[] line = fr.nextLine().split("\t"); 
                movies.add(new Movie(line[0], Double.parseDouble(line[1]), line[2], line[3], Integer.parseInt(line[4])));
            }
            Collections.sort(movies,(a,b) -> a.getName().compareToIgnoreCase(b.getName()));
            Map<String,Integer> genres = new HashMap<>();
            for(Movie m : movies){
                genres.merge(m.getGenre(), 1, (a,b)  -> a + b);
            }
        Collections.sort(movies, Comparator.comparing(Movie::getScore));
        Collections.reverse(movies);
        }catch(FileNotFoundException e){
            System.out.println("File does not exist");
        }

    }
    
}
