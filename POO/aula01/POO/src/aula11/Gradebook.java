package aula11;

import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Gradebook {

    private ArrayList<Student> students;

    public Gradebook(){
        this.students = new ArrayList<Student>();
    }

    public void load(String file){
        try{
        FileReader fr = new FileReader(file);
        int data = fr.read();
        while(data != -1){
            data = fr.read();
            }
        fr.close();
        }catch(FileNotFoundException e){
            System.out.println("File does not exist");
        }catch(IOException e){
            System.out.println("Error!");
        }
    }
    
    public void removeStudent(String name){
        for(Student s: this.students){
            if(s.getName() == name){
                this.students.remove(s);
            }
        }
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public Student getStudent(String name){
        for(Student s: this.students){
            if(s.getName() == name){
                return s;
            }else{
                return null;
            }
        }
        return null;
    }

    public double calculateAverageGrade(String name){
        double grade = 0;
        for(double d: this.getStudent(name).getGrades()){
            grade = grade + d;
        }

        return (grade/this.getStudent(name).getGrades().size());
    }

    public void printAllStudents(){
        for(Student s: this.students){
            System.out.println(s);
        }
    }

    public ArrayList<Student> getStudents(){
        return students;
    }
}
