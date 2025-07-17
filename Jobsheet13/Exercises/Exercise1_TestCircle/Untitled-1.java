// Abstract Data Type (ADT)
interface Loanable {
    void borrow();

    void returnItem();
}

// Class
class Item {
    private String title;
    private int year;

    public Item(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}

// Inheritance
class Book extends Item implements Loanable {
    private String author;

    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    // Polymorphism
    @Override
    public void borrow() {
        System.out.println("Book borrowed: " + getTitle());
    }

    @Override
    public void returnItem() {
        System.out.println("Book returned: " + getTitle());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", year=" + getYear() +
                ", author='" + author + '\'' +
                '}';
    }
}

// Encapsulation
class Library {
    private Item[] catalog;

    public Library(Item[] catalog) {
        this.catalog = catalog;
    }

    public void displayCatalog() {
        for (Item item : catalog) {
            System.out.println(item);
        }
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        // Object Cycle
        Book book1 = new Book("The Java Programming Language", 2022, "James Gosling");
        Book book2 = new Book("Clean Code", 2008, "Robert C. Martin");

        Item[] catalog = { book1, book2 };
        Library library = new Library(catalog);

        // Abstraction
        library.displayCatalog();

        // Using ADT
        book1.borrow();
        book2.borrow();

        book1.returnItem();
        book2.returnItem();
    }
}
