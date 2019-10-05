import java.util.ArrayList;

public class BookService {
    public static void printElementsByAauthor(String autor, ArrayList<Book> arrayToPrint) {
        for (Book element : arrayToPrint){
            if ( autor == element.getAuthor())
                System.out.println(element.toString());
        }
    }

    public static void printElementsByPublisher(String publisher, ArrayList<Book> arrayToPrint) {
        for (Book element : arrayToPrint){
            if ( publisher == element.getPublisher())
                System.out.println(element.toString());
        }

    }

    public static void printElementsByStorageLife(int storageLife, ArrayList<Book> arrayToPrint){
        for (Book element : arrayToPrint){
            if (storageLife > element.getYearOfPublish()){
                System.out.println(element.toString());
            }
        }
    }


}
