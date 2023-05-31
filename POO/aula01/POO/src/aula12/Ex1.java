package aula12;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        HashSet<String> word = new HashSet<String>(); 
        try {
            Scanner fr = new Scanner(new FileReader("C:/Users/gabib/Desktop/ProjCla/POO/aula01/POO/src/aula12/Ficheiro.txt"));
            int words = 0;
            while (fr.hasNext()){
                String palavra = fr.next();
                System.out.println(palavra);
                words++;
                word.add(palavra);
            }
            System.out.println(word);
            System.out.println(words);
            fr.close();
        }catch (FileNotFoundException e){
            System.out.println("File does not exist!");
        }
    }
}
