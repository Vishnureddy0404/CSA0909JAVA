import java.util.Scanner;
class Item {
    private String title;
    private String author;
    public Item(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class Book extends Item {
    private int pageCount;
    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }
    public void borrowBook() {
        System.out.println("Borrowing the book: " + getTitle());
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Page Count: " + pageCount);
    }
}
class DVD extends Item {
    private double duration;
    public DVD(String title, String author, double duration) {
        super(title, author);
        this.duration = duration;
    }
    public void borrowDVD() {
        System.out.println("Borrowing the DVD: " + getTitle());
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration: " + duration + " hours");
    }
}

public class R192211820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title:");
        String bookTitle = scanner.nextLine();
        System.out.println("Enter book author:");
        String bookAuthor = scanner.nextLine();
        System.out.println("Enter number of pages:");
        int pageCount = scanner.nextInt();
        scanner.nextLine(); 
        Book book = new Book(bookTitle, bookAuthor, pageCount);
        book.displayInfo();
        book.borrowBook();
        System.out.println();
        System.out.println("Enter DVD title:");
        String dvdTitle = scanner.nextLine();
        System.out.println("Enter DVD author:");
        String dvdAuthor = scanner.nextLine();
        System.out.println("Enter duration of the DVD in hours:");
        double duration = scanner.nextDouble();
        DVD dvd = new DVD(dvdTitle, dvdAuthor, duration);
        dvd.displayInfo();
        dvd.borrowDVD();
        scanner.close();
    }
}
