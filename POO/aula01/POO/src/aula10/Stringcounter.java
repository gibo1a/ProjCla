package aula10;
import java.util.Map;
import java.util.HashMap;

public class Stringcounter {
    public static void main(String[] args) {
        Map<Character,Integer> letters = new HashMap<Character,Integer>();
        String stirng = "Hello World";
        for(int i = 0; i < stirng.length();i++){
            letters.put(stirng.charAt(i), i);
        }
    }
}
