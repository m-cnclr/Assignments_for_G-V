public class Book {


        // YOUR VARIABLES HERE
    private String author;
    private String title;
    private int year;

    public Book (String author, String title, int year) {

        // YOUR CODE HERE
       this.author = author;
       this.title = title;
       this.year = year;

    }

    public String getAuthor() {

        // YOUR CODE HERE
        return author;

    }
    public String getTitle() {

        // YOUR CODE HERE
        return title;

    }
    public int getYear(){

        // YOUR CODE HERE
        return year;

    }

    public boolean equals(Book other) {

        // YOUR CODE HERE
        if(getAuthor().equals(other.getAuthor()) 
            && getTitle().equals(other.getTitle()) 
            && getYear() == other.getYear()){
            return true;
        }
        return false;
    }

    public String toString() {

        // YOUR CODE HERE
        return  author +"; " + title + "(" + year + ")";

    }

    public int compareTo(Book other) {
       
        // YOUR CODE HERE

        int result; 
        result = getAuthor().compareTo(other.getAuthor()); 

        if (result != 0){
            return result;
        }
        
        result = getTitle().compareTo(other.getTitle());

        if(result != 0){
            return result;
        } 
        else if(getYear() < other.getYear()){
                return -1;
            }
            else if(getYear() == other.getYear()){
                return 0;
            } 
            else{
                return 1;
            }
    }
}
