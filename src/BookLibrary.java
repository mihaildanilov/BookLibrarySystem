import java.util.HashMap;
import java.util.Scanner;

public class BookLibrary {
    private final HashMap<String, Book> library = new HashMap<>();
    private HashMap<Object, Object> getAllBooks;


    public void addBooks(Scanner scanner) {
        System.out.println("Enter details in the format: ISBN Author BookName NumberOfPages Genre PublicationYear Publisher.");
        System.out.println("Type 'exit' at any time to stop adding books.");

        while (true) {
            String info = scanner.nextLine().trim();
            if ("exit".equalsIgnoreCase(info)) {
                break;
            }

            String[] bookInfo = info.split(" ", 7);

            if (bookInfo.length < 7) {
                System.out.println("Incorrect input format. Please try again.");
                continue;
            }

            if (this.library.containsKey(bookInfo[0])) {
                System.out.println("A book with this ISBN already exists: " + this.library.get(bookInfo[0]).getBookName());
            } else {
                try {
                    String isbn = bookInfo[0];
                    String author = bookInfo[1];
                    String bookName = bookInfo[2];
                    int numberOfPages = Integer.parseInt(bookInfo[3]);
                    String genre = bookInfo[4];
                    int publicationYear = Integer.parseInt(bookInfo[5]);
                    String publisher = bookInfo[6];
                    this.library.put(isbn, new Book(isbn, author, bookName, numberOfPages, genre, publicationYear, publisher));
                    System.out.println("Book added successfully.");
                } catch (NumberFormatException e) {
                    System.out.println("Number of pages or publication year is not valid. Please try again.");
                }
            }

            System.out.println("Enter details of the next book or type 'exit' to finish.");
        }
    }

    private HashMap<String, Book> getAllBooks() {
        return library;
    }

    public void printAllBooks() {
        for (Book item : this.getAllBooks().values()) {
            System.out.println(item.toString());
        }
    }
}
