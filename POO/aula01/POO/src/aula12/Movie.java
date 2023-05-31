package aula12;

public class Movie implements Comparable<Movie>{
    private String name;
    private double score;
    private String rating;
    private String genre;
    private int running_time;

    public Movie(String name, double score, String rating, String genre, int running_time ){
        this.setGenre(genre);
        this.setName(name);
        this.setScore(score);
        this.setRating(rating);
        this.setTime(running_time);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setScore(double score){
        this.score = score;
    }

    public void setRating(String rating){
        this.rating = rating;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setTime(int time){
        this.running_time = time;
    }

    public String getName(){
        return name;
    }

    public double getScore(){
        return score;
    }

    public String getRating(){
        return rating;
    }

    public String getGenre(){
        return genre;
    }

    public int getTime(){
        return running_time;
    }

    @Override
    public int compareTo(Movie movie) {
        return this.getName().compareToIgnoreCase(movie.getName());
    }
    
}
