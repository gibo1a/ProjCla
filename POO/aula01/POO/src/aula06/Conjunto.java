package aula06;
import java.util.ArrayList;

public class Conjunto {
    private ArrayList<Integer> numbers;
    Conjunto(){
        this.numbers = new ArrayList<Integer>();
    }
    
    void insert(int n){
        if(this.numbers.contains(n)){
            System.out.println("O conjunto já contém o número!");
        }else{
            this.numbers.add(n);
        }

    }

    boolean contains(int n){
        for(int i = 0; i < this.numbers.size();i++ ){
            if(this.numbers.get(i) == n){
                return true;
            }else{
                continue;
            }
        }
        return false;
    }

    void remove(int n){
        if(this.numbers.contains(n)){
            this.numbers.remove(this.numbers.get(this.numbers.indexOf(n)));
        }else{
            System.out.println("O conjunto não contém o número " + n);
        }
    }

    void empty(){
        this.numbers.clear();
    }

    @Override
    public String toString() {
        String num = "";
        for(int i = 0 ; i < this.numbers.size(); i++){
          num = num + "; " + Integer.toString(this.numbers.get(i));
        }
        return num;
    }

    int size(){
        return this.numbers.size();
    }

    Conjunto combine(Conjunto add){
        Conjunto combination = new Conjunto();
        for(int i = 0; i < this.numbers.size();i++){
            combination.numbers.add(this.numbers.get(i));
        }
        for(int i = 0; i < add.numbers.size();i++){
            if(combination.numbers.contains(add.numbers.get(i))){
                continue;
            }else{
                combination.numbers.add(add.numbers.get(i));
            }
        }
        return combination;
    } 

    Conjunto subtract(Conjunto sub){
        Conjunto subtraction = new Conjunto();
        for(int i = 0; i < this.numbers.size();i++){
            subtraction.numbers.add(this.numbers.get(i));
        }
        for(int i = 0; i < sub.numbers.size();i++){
            if(subtraction.numbers.contains(sub.numbers.get(i))){
                subtraction.numbers.remove(sub.numbers.get(i));
            }else{
                continue;
            }
        }
        return subtraction;

    }

    Conjunto intersect(Conjunto inter){
        Conjunto intersection = new Conjunto();
        for(int i = 0; i < this.numbers.size();i++){
            intersection.numbers.add(this.numbers.get(i));
        }
        for(int i = 0;i < this.numbers.size();i++){
            if(inter.numbers.contains(this.numbers.get(i))){
                continue;
            }else{
                intersection.numbers.remove(this.numbers.get(i));
            }
        }
        return intersection;
    }





}
