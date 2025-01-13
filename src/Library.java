import java.sql.SQLOutput;

public class Library {

    public String owner = "Mx. Bradford";
    public Book[] allBooks;
    public int[] allReviews = new int[10];
    public static void main(String[] args) {
        //TODO: Make an instance of the main class
        Library library = new Library();
        library.owner = "Felix Stuart";

    }

    public Library(){

        System.out.println("Welcome to "+ owner + "'s library!!!!!");
        //TODO: Give the array allReviews a size of 10
        this.allBooks = new Book[10];
        //TODO: Fill the array allReviews with reviews with random ratings from 0 to 10 inclusive
        for (int i = 0; i < allBooks.length; i++) {
            allBooks[i] = new Book((int) (Math.random()*11));
        }
        //TODO: print all the ratings in the array allReviews
        for (int i = 0; i < allBooks.length; i++) {
            allReviews[i] = allBooks[i].rating;
        }
        //TODO: Call the method averageRating
        averageRating();
    }

    public void averageRating(){
        int total = 0;
        //TODO: calculate the average rating from the array allReviews and print it
        for (Book book : allBooks) {
            total += book.rating;
        }
        System.out.println(total/allBooks.length);
    }
}
