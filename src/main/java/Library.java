import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    public ArrayList creatingListOfBooks(){
        ArrayList<Book> list = new ArrayList<Book>();
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want add new books?");
        System.out.println("Enter number of products to add: ");
        int countProducts = input.nextInt();
        for (int i = 0; i < countProducts; i++){
            Book newBook = new Book();

            System.out.println("Enter Id: ");
            newBook.setId(input.next());

            System.out.println("Enter name: ");
            newBook.setName(input.next());

            System.out.println("Enter author: ");
            newBook.setAuthor(input.next());

            System.out.println("Enter publisher: ");
            newBook.setPublisher(input.next());

            System.out.println("Enter year of publish: ");
            newBook.setYearOfPublish(input.nextInt());

            System.out.println("Enter number of pages: ");
            newBook.setNumberOfPages(input.nextInt());

            System.out.println("Enter price: ");
            newBook.setPrice(input.nextInt());

            System.out.println("Enter type of cover: ");
            newBook.setTypeOfCover(input.next());

            list.add(newBook);
        }
      return list;
    }

    public static void main(String[] args) {
        Library firstTest = new Library();
        ArrayList<Library> list = new ArrayList<Library>();
        list = firstTest.creatingListOfBooks();
        System.out.println(list.toString());

    }

}
