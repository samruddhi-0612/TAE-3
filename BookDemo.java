class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " | " + author + " | " + price);
    }
}

public class BookDemo {
    public static void main(String[] args) {

        Book[] books = {
            new Book("Java Basics", "James", 500),
            new Book("Python Guide", "Guido", 600),
            new Book("C Programming", "Dennis", 400)
        };

        for (Book b : books) {
            b.display();
        }
    }
}