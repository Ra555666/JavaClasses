package Books;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        ArrayList<Book> list = library.creatingListOfBooks();
        BookService service = new BookService();
        service.printElementsByAuthor("Gogol",list);

//        Books.BookService.createNewBook("Kola","Gavno");
//        Books.BookService.createNewBook("Kola1","Gavno1");
//        Books.BookService.createNewBook("Kola2","Gavno2");
//        System.out.println( Books.BookService.findBookByAuthor("Gavno"));
    }
}
