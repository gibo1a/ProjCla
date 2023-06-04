import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import Avaliacao.Book;
import Avaliacao.BookManagerInterface;

import java.io.FileNotFoundException;

public class BookManager implements BookManagerInterface{
    private ArrayList<Book> books;
    public static int id = 0;

    public BookManager(){
        this.books = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    @Override
    public void load(String filePath) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");

        try{
            Scanner fr = new Scanner(new FileReader(filePath));
            while(fr.hasNext()){
                String[] line = fr.nextLine().split("\t");
                this.getBooks().add(new Book(id++, line[0], line[1], line[2], line[3], LocalDate.parse(line[4], formatter)));
            }
        }catch (FileNotFoundException e){
            System.out.println("File does not existe!!");
        }

    }

    @Override
    public void save(String filePath) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Book> searchByDateInterval(LocalDate fromDate, LocalDate toDate) {
        ArrayList<Book> booksByDate = new ArrayList<>();
        for(Book b : books){
            if(b.getRealesDate().compareTo(fromDate) > 0 && b.getRealesDate().compareTo(toDate) < 0){
                booksByDate.add(b);
            }else{
                return null;
            }
        }
        return booksByDate;
    }

    @Override
    public void listAllBooks() {
        for(Book b : this.getBooks()){
            System.out.println(b);
        }
    }

    @Override
    public boolean validateISBN(String isbn) {
        if(isbn.contains("-")){
            String[] numbers = isbn.split("-");
            int sum = 0;
            for(String n : numbers){
                sum += n.length();
            }
            if(sum != 13){
                return false;
            }else{
                return true;
            }
        }else{
            int sum = 0;
            for(Character c : isbn.toCharArray()){
                sum += 1;
                }
            if(sum != 13){
                return false;
            }else{
                return true;
            }
            }
        }

    @Override
    public Book searchByname(String name) {
        for(Book b : this.getBooks()){
            if(b.getName() == name){
                return b;
            }else{
                return null;
            }
        }
        return null;
    }
    
    @Override
    public List<Book> searchByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for(Book b : this.getBooks()){
            if(b.getAuthor() == author){
                booksByAuthor.add(b);
            }else{
                continue;
            }
        }

        return booksByAuthor;
    }

    @Override
    public Book searchByISBN(String isbn) {
        for(Book b : this.getBooks()){
            if(b.getIsbn() == isbn){
                return b;
            }else{
                return null;
            }
        }
        return null;
    }

    @Override
    public boolean addBook(Book book) {
        for(Book b : this.getBooks()){
            if(b.getIsbn() == book.getIsbn()){
                return false;
            }else{
                this.getBooks().add(book);
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean removeBook(Book book) {
        for(Book b : this.getBooks()){
            if(b.getIsbn() == book.getIsbn()){
                this.getBooks().remove(book);
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    @Override
    public void listBooksByName() {
        Collections.sort(this.getBooks(), (a,b)-> a.getName().compareToIgnoreCase(b.getName()));
        for(Book b : this.getBooks()){
            System.out.println(b);
        }
    }

    @Override
    public void listBooksByAuthor() {
        Collections.sort(this.getBooks(), (a,b)-> a.getAuthor().compareToIgnoreCase(b.getAuthor()));
        for(Book b : this.getBooks()){
            System.out.println(b);
        }
        
    }

    @Override
    public void listBooksByDate() {
        Collections.sort(this.getBooks(), (a,b)-> a.getRealesDate().compareTo(b.getRealesDate()));
        for(Book b : this.getBooks()){
            System.out.println(b);
        };
    }
}

