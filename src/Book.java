public class Book {
    private String isbn;
    private String author;
    private String bookName;
    private int numberOfPages;
    private String genre;
    private int publicationYear;
    private String publisher;


    public Book(String isbn, String author, String bookName, int numberOfPages, String genre, int publicationYear, String publisher) {
        this.isbn = isbn;
        this.author = author;
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
    }

    public void setIsbn(String isbn) {
        if (isbn != null && !isbn.isEmpty()) {
            this.isbn = isbn;
        } else {
            throw new IllegalArgumentException("ISBN cannot be empty");
        }
    }

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            throw new IllegalArgumentException("Author cannot be empty");
        }
    }

    public void setBookName(String bookName) {
        if (bookName != null && !bookName.isEmpty()) {
            this.bookName = bookName;
        } else {
            throw new IllegalArgumentException("Book name cannot be empty!");
        }
    }

    public void setNumberOfPages(int bookPages) {
        if (bookPages > 0) {
            this.numberOfPages = bookPages;
        } else {
            throw new IllegalArgumentException("Number of pages cannot be " + (bookPages == 0 ? "0" : "negative" + "!"));
        }
    }

    public void setGenre(String genre) {
        if (genre != null && !genre.isEmpty()) {
            this.genre = genre;
        } else {
            throw new IllegalArgumentException("Genre cannot be empty");
        }
    }

    public void setPublicationYear(int publicationYear) {
        if (publicationYear > 0) {
            this.publicationYear = publicationYear;
        } else {
            throw new IllegalArgumentException("Publication year cannot be " + (publicationYear == 0 ? "0" : "negative" + "!"));
        }
    }

    public void setPublisher(String publisher) {
        if (publisher != null && !publisher.isEmpty()) {
            this.publisher = publisher;
        } else {
            throw new IllegalArgumentException("Publisher cannot be empty");
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }


    public String getBookInfo() {
        return "ISBN: " + isbn + "\n" +
                "Author: " + author + "\n" +
                "Book Name: " + bookName + "\n" +
                "Number of Pages: " + numberOfPages + "\n" +
                "Genre: " + genre + "\n" +
                "Publication Year: " + publicationYear + "\n" +
                "Publisher: " + publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", genre='" + genre + '\'' +
                ", publicationYear=" + publicationYear +
                ", publisher='" + publisher + '\'' +
                '}';
    }

}
