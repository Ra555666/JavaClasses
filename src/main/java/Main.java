import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        ArrayList<Book> list = library.creatingListOfBooks();
        BookService service = new BookService();
        service.printElementsByAuthor("a",list);

//        BookService.createNewBook("Kola","Gavno");
//        BookService.createNewBook("Kola1","Gavno1");
//        BookService.createNewBook("Kola2","Gavno2");
//        System.out.println( BookService.findBookByAuthor("Gavno"));
    }
}
