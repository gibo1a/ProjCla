package Avaliacao;

import java.time.LocalDate;

public class Book {
    private int id;
    private String name;
    private String author;
    private String editor;
    private String isbn;
    private LocalDate realeaseDate;

    public Book(int id, String name, String author, String editor, String isbn, LocalDate realeaseDate){
        this.setId(id);
        this.setAuthor(author);
        this.setName(name);
        this.setEditor(editor);
        this.setIsbn(isbn);
        this.setReleaseDate(realeaseDate);
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setEditor(String editor){
        this.editor = editor;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setReleaseDate(LocalDate realeaseDate){
        this.realeaseDate = realeaseDate;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public String getEditor(){
        return editor;
    }

    public String getIsbn(){
        return isbn;
    }

    public LocalDate getRealesDate(){
        return realeaseDate;
    }

    @Override
    public String toString() {
        return "Name : " + this.getName() + "\n" + "Author : " + this.getAuthor() + "\n" + "Editor : " + this.getAuthor() +"\n" + "Isbn : " + this.getIsbn() + "\n" + "RealeaseDate : " + this.getRealesDate();
    }

    @Override
    public int hashCode() {
        if(isbn.contains("-")){
            String[] numbers = isbn.split("-");
            String hash = "";
            for(String n : numbers){
                hash += n;
            }
            return Integer.parseInt(hash) * 37;
        }else{
            return Integer.parseInt(isbn) * 37;
        }
    }
}
