class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getBookInfo() {
        return "Title: " + title + "\nAuthor: " + author + "\nYear Published: " + yearPublished;
    }

    public void printBookDetails() {
        System.out.println(getBookInfo());
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

    @Override
    public String getBookInfo() {
        return super.getBookInfo() + "\nPublisher: " + publisher + "\nNumber of Pages: " + numberOfPages;
    }

    @Override
    public void printBookDetails() {
        System.out.println("Printed Book Info:");
        System.out.println(getBookInfo());
        System.out.println("Book Type: PrintedBook\n");
    }

    public void bookType() {
        System.out.println("This is a printed book");
    }

    public void printBook() {
        System.out.println("Printing the book...");
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

    @Override
    public String getBookInfo() {
        return super.getBookInfo() + "\nFile Size: " + fileSizeMB + " MB\nFile Format: " + fileFormat;
    }

    @Override
    public void printBookDetails() {
        System.out.println("EBook Info:");
        System.out.println(getBookInfo());
        System.out.println("Book Type: EBook\n");
    }

    public void bookType() {
        System.out.println("This is an ebook");
    }
}

class Main {
    public static void main(String[] args) {
        PrintedBook printedBook = new PrintedBook("Fight Club", "Chuck Palahniuk", 1996, 256, "AST");
        EBook eBook = new EBook("Castle", "Franz Kafka", 1922, 3.9, "PDF");

        printedBook.printBookDetails();
        printedBook.bookType();
        printedBook.printBook();
        System.out.println();

        eBook.printBookDetails();
        eBook.bookType();
    }
}
