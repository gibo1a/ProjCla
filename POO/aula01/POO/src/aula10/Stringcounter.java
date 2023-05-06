package aula10;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Stringcounter {
    public static void main(String[] args) {
        Map<Character,ArrayList<Integer>> letters = new HashMap<Character,ArrayList<Integer>>();
        String stirng = "Hello World";
        for(int i = 0; i < stirng.length();i++){
            if(letters.keySet().contains(stirng.charAt(i))){
                letters.get(stirng.charAt(i)).add(i);
            }else{
                letters.put(stirng.charAt(i),new ArrayList<Integer>());
                letters.get(stirng.charAt(i)).add(i);
            }
        }
        System.out.println(letters);
    }
}
