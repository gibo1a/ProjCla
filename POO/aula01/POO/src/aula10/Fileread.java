package aula10;
import java.util.HashSet;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;

public class Fileread {
    public static void main(String[] args) throws IOException{
        HashSet<String> words = new HashSet<String>();
        Scanner input = new Scanner(new FileReader("words.txt"));
        while (input.hasNext()) {
            String word = input.next();
            System.out.println(word);
            if(word.length() > 2){
                words.add(word);
            }
            if(word.endsWith("s")){
                System.out.println(word);
            }
            for(int i = 0; i < word.length(); i++){
                if(Character.isLetter(word.charAt(i))){
                    continue;
                }else{
                    words.remove(word);
                }
            }
            }
        }
}
