import java.util.Scanner;

class Book {
    String title;
    String author;
    int pages;
    int price;
    String publisher;

    public Book() {         // this is a constructor
        this("","","","","");
    }

    public Book(String ... param) {     // this is a constructor
        this.title = param[0];
        this.author = param[1];
        this.pages = Integer.parseInt(param[2]);
        this.price = Integer.parseInt(param[3]);
        this.publisher = param[4];
    }

    public void showInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Pages: " + this.pages);
        System.out.println("Price: " + this.price);
        System.out.println("Publisher: " + this.publisher);
    }

    String getAddr() {
        return this.toString().substring(this.toString().indexOf("@")+1);
    }
}

class Library extends Book {
    private int counter;
    private int totalPrice;
    private int totalPages;
    
    public Library() {
        this.counter = 0;
        this.totalPrice = 0;
        this.totalPages = 0;
    }

    public void addBook(Book book) {
        this.counter++;
        this.totalPages += book.pages;
        this.totalPrice += book.price;
    }

    public void showInfo() {
        System.out.println("Number of books: " + this.counter);
        System.out.println("Total pages: " + this.totalPages);
        System.out.println("Total price: " + this.totalPrice);
    }
}

public class J_xxiv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Book book1 = new Book(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
        Book book = new Book("The C Programming Language", " Brian W. Kernighan", "654", "25", "Prentice Hall");
        book.showInfo();
        
        Library library = new Library();
        // while (in.hasNextLine()) {
        //     String[] param = in.nextLine().split(" ");
        //     Book book1 = new Book(param[0], param[1], param[2], param[3], param[4]);
        //     library.addBook(book1);
        // }
        // library.showInfo();

        System.out.println(library.getAddr());
        System.out.println(book.getAddr());

        in.close();
    }
}
