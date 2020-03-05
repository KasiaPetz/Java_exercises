package sort;

import java.util.*;

public class Book implements Comparable<Book> {

    public static void main(String[] args) {

        Book b1 = new Book("Bdam", "Roman");
        Book b2 = new Book("Zdam", "Zbigniew");
        Book b3 = new Book("Cdam", "Adam");
        Book b4 = new Book("Adam", "Adam");
        Book b5 = new Book("Bdam", "Dzban");

        List<Book> books = new ArrayList<>();
        String s;
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        Collections.sort(books, Comparator.comparing(Book::getAuthor));
        Collections.sort(books, Book.getAuthorComparator());

        System.out.println(books);
    }

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}' + "\n";
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }

    public static Comparator<Book> getAuthorComparator() {
        return Comparator.comparing(Book::getAuthor);
    }

}
