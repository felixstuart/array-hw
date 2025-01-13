import java.sql.SQLOutput;

public class Book {
    
    public int rating;
    public String title;
    public String author;
    
    public Book(int pRating){
        title = "Bad Blood";
        author = "John Carreyrou";
        // TODO: set the instance variable to the parameter
        this.rating = pRating;


    }

    public void print(){
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        //TODO: use System.out to print the values of the
        //      instance varibles so the user can see the review
        System.out.println("rating: "+ rating);

    }

    
}