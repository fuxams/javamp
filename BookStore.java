import java.util.Scanner;

public class BookStore {
    private String category, id;
    private String author;
    private String title;
    private String publisher;
    private double sellingPrice;
    private int qty;
    private static int total_books;

    public BookStore(String id, String category, String author, String title, String publisher, double sellingPrice, int qty) {
        this.id = id;
        this.category = category;
        this.author = author;
        this.title = title;
        this.qty = qty;
        this.publisher = publisher;
        this.sellingPrice = sellingPrice;
        this.total_books = this.total_books + qty;
    }

    public static void trackSalesStatus() {
        System.out.println("Total no. of books sold: " + total_books);
    }

    void displayQuantity() {
        System.out.println("Book " + id + " is found and available quantity: " + qty);
    }

    public String getId() {
        return id;
    }

    public static void main(String[] args) {
        String id, publisher, category, author, title;
        double price;
        int qty;
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter no.of books to be created: ");
        size = sc.nextInt();
        BookStore bs[] = new BookStore[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter book details for book " + (i + 1) + ": ");
            System.out.println("ID: ");
            id = sc.next();
            sc.nextLine(); // Consume newline left-over
            System.out.println("Category: ");
            category = sc.nextLine();
            System.out.println("Author: ");
            author = sc.nextLine();
            System.out.println("Title: ");
            title = sc.nextLine();
            System.out.println("Publisher: ");
            publisher = sc.nextLine();
            System.out.println("Price: ");
            price = sc.nextDouble();
            System.out.println("Quantity: ");
            qty = sc.nextInt();
            bs[i] = new BookStore(id, category, author, title, publisher, price, qty);
        }
        BookStore.trackSalesStatus();
        System.out.println("Enter book id to get details: ");
        id = sc.next();
        for (int i = 0; i < size; i++) {
            if (bs[i].getId().equals(id)) {
                bs[i].displayQuantity();
                break;
            }
        }
    }
}

