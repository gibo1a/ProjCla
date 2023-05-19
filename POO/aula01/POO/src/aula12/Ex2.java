package aula12;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex2 {
    public static void main(String[] args) {
        TreeMap<String,Integer> words = new TreeMap<String,Integer>();
        try {
            Scanner fr = new Scanner(new FileReader("C:/Users/gabib/Desktop/ProjCla/POO/aula01/POO/src/aula12/Ficheiro.txt"));
            while (fr.hasNext()){
                String word = fr.next();
                if (word.length() >= 3){
                    words.merge(word.toLowerCase(), 1, (a,b) -> a + b);
                }
            }
            System.out.println(words);
        } catch (FileNotFoundException e) {
            System.out.println("File doesnt exist");
        }
    }
    
}
