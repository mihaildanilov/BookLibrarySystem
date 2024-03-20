import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookLibrary myLibrary = new BookLibrary();
        myLibrary.addBooks(scanner);
        myLibrary.printAllBooks();

        scanner.close();
    }
}