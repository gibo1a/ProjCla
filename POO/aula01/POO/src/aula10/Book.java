package aula10;

public class Book {
    private String title;
    private String author;
    private int year;
    public Book(){}
    public Book(String title, String author, int year){
        this.setTitle(title);
        this.setYear(year);
        this.setAuthor(author);
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }
}
