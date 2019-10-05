import java.util.ArrayList;

public class BookService {
//    private static Library library = new Library();

//    public static void createNewBook(String authorName, String bookName) {
//        Book book = new Book(authorName, bookName);
//        library.addBook(book);
//    }

//    public static String findBookByAuthor(String authorName) {
//        return library.getBooks().stream()
//                .filter(book -> book.getAuthor().equals(authorName))
//                .findFirst()
//                .get()
//                .toString();
//    }


    public static void printElementsByAuthor(String autor, ArrayList<Book> arrayToPrint) {
        for (Book element : arrayToPrint) {
            if (autor.equals(element.getAuthor()))
                System.out.println(element.toString());
        }
    }

    public static void printElementsByPublisher(String publisher, ArrayList<Book> arrayToPrint) {
        for (Book element : arrayToPrint) {
            if (publisher == element.getPublisher())
                System.out.println(element.toString());
        }

    }

    public static void printElementsByStorageLife(int storageLife, ArrayList<Book> arrayToPrint) {
        for (Book element : arrayToPrint) {
            if (storageLife > element.getYearOfPublish()) {
                System.out.println(element.toString());
            }
        }
    }


}
