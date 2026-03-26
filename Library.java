import java.util.*;

class Book {
    String title, author, isbn;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        books.removeIf(book -> book.isbn.equals(isbn));
    }

    void displayBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("Java", "James Gosling", "101"));
        lib.addBook(new Book("Python", "Guido", "102"));

        System.out.println("Books in Library:");
        lib.displayBooks();

        lib.removeBook("101");

        System.out.println("After Removing:");
        lib.displayBooks();
    }
}