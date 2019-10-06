import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
//    private List<Book> list = new ArrayList<Book>();

//    public void addBook(Book book) {
//        list.add(book);
//    }

//    public List<Book> getBooks() {
//        return list;
//    }

    public ArrayList creatingListOfBooks() {
        ArrayList<Book> list = new ArrayList<Book>();
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want add new books?");
        System.out.println("Enter number of products to add: ");
        while (!input.hasNextInt()) {
            System.out.println("Input is not a number.");
            input.nextLine();
        }
        String countProducts = input.nextLine();
        int count = Integer.parseInt(countProducts);
        for (int i = 0; i < count; i++) {
            Book newBook = new Book();

            System.out.println("Enter Id: ");
            String id = input.nextLine();
            newBook.setId(id);

            System.out.println("Enter title: ");
            newBook.setName(input.nextLine());

            System.out.println("Enter author: ");
            newBook.setAuthor(input.nextLine());

            System.out.println("Enter publisher: ");
            newBook.setPublisher(input.nextLine());

            System.out.println("Enter year of publish: ");
            while (!input.hasNextInt()) {
                System.out.println("Input is not a number.");
                input.nextLine();
            }
            int year = input.nextInt();
            newBook.setYearOfPublish(year);

            System.out.println("Enter number of pages: ");
            while (!input.hasNextInt()) {
                System.out.println("Input is not a number.");
                input.nextLine();
            }
            int pages = input.nextInt();
            newBook.setNumberOfPages(pages);

            System.out.println("Enter price: ");
            while (!input.hasNextInt()) {
                System.out.println("Input is not a number.");
                input.nextLine();
            }
            int price = input.nextInt();
            newBook.setPrice(price);

            System.out.println("Enter type of cover: ");
            while (!input.nextLine().isEmpty()) {
                System.out.println("Input is empty.");
                input.nextLine();
            }
            String cover = input.nextLine();
            newBook.setTypeOfCover(cover);

            list.add(newBook);
            System.out.println("Book " + newBook.getName() + " is added.");
            System.out.println("What is next book?");

        }

        return list;
    }


}
