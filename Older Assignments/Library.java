
public class Library {


        // YOUR VARIABLES HERE
    private int size;
    private static int i; 
    private Book[] library; 
    

    public Library(int size){

        // YOUR CODE HERE
        i = 0;
        this.size = size;
        library = new Book[size];

    }

    public void addBook (Book book){

        // YOUR CODE HERE
        if(i < size){
            library[i] = book;
            i++;
        }

        else {
        System.out.println("\"The library is full.\"");

      }

    }

    public void printLibrary(){

        // YOUR CODE HERE
        System.out.println("The Library Contains the following books:");
        for (int j = 0; j < i; j++){
           System.out.println(library[j]);  
        }      

    }


    public void searchAuthor(String author){

        // YOUR CODE HERE
        System.out.println("Search library for books by " + author);
        for(int j = 0; j < size; j++){
            if(library[j].getAuthor().equals(author)){
                System.out.print(library[j]);
                 System.out.println();
            }
        }
    }

    public void searchTitle(String title){

        // YOUR CODE HERE
        System.out.println("Search library for books by " + title);
        for(int j = 0; j < size; j++){
            if(library[j].getTitle().equals(title)){
                System.out.print(library[j]);
                System.out.println();
            }
        }
    }

    public void searchYear(int year){

        // YOUR CODE HERE
        System.out.println("Search library for books by " + year);
        for(int j = 0; j < size; j++){
            if(library[j].getYear() == (year)){
                System.out.print(library[j]);
                System.out.println();
            }
        }

    }

    public void sort() {

        // YOUR CODE HERE
        for(int j = 0; j < i; j++){
            int min = j;
            for (int k = j+1; k < i; k++){
                if(library[k].compareTo(library[min]) < 1){
                    min = k;
                }   
            }
            if(j != min){
                Book temp = library[min];
                library[min] = library[j];
                library[j] = temp;
            }
            
        }
    }

}       
