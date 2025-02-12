class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}

class PrintedBook extends Book {
    private int numberOfPages;
    private String publisher;

    public PrintedBook(String title, String author, int yearPublished, int numberOfPages, String publisher) {
        super(title, author, yearPublished);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    public void printBookDetails() {
        System.out.println("Printed Book Info:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year Published: " + getYearPublished());
        System.out.println("Publisher: " + publisher);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Book Type: PrintedBook\n");
    }
}

class EBook extends Book {
    private double fileSizeMB;
    private String fileFormat;

    public EBook(String title, String author, int yearPublished, double fileSizeMB, String fileFormat) {
        super(title, author, yearPublished);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = fileFormat;
    }

    public void printBookDetails() {
        System.out.println("EBook Info:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year Published: " + getYearPublished());
        System.out.println("File Size: " + fileSizeMB + " MB");
        System.out.println("File Format: " + fileFormat);
        System.out.println("Book Type: EBook\n");
    }
}

public class BookInheritance {
    public static void main(String[] args) {
        PrintedBook printedBook = new PrintedBook("Fight Club", "Chuck Palahniuk", 1996, 256, "AST");
        EBook eBook = new EBook("Castle", "Franz Kafka", 1922, 3.9, "PDF");

        printedBook.printBookDetails();
        eBook.printBookDetails();
    }
}