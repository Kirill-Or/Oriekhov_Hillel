package Hw8.POJO;

import java.util.ArrayList;

public class BookTester {
    public static void main(String[] args) {


        ArrayList<Book> bookCollection = new ArrayList<>();
        bookCollection.add(new Book(5.0, " American Tragedy", "hard", 500));
        bookCollection.add(new Book(5.5, " Anatomy", "hard", 100));
        bookCollection.add(new Book(4.0, " 451 degrees Fahrenheit", "soft", 200));
        bookCollection.add(new Book(4.5, " Green Mile ", "hard", 150));
        bookCollection.add(new Book(3.0, " Harry Potter", "hard", 144));
        bookCollection.add(new Book(2.0, " Lord of the Rings", "soft", 522));
        bookCollection.add(new Book(1.0, " It", "hard", 576));
        bookCollection.add(new Book(5.0, " goldfinch", "hard", 357));
        bookCollection.add(new Book(6.0, " hobbit", "soft", 123));
        bookCollection.add(new Book(7.0, " poor dad rich dad", "soft", 345));
        ArrayList<Book> booksWithSoftCover = new ArrayList();
        ArrayList<Book> booksWithHardCover = new ArrayList();
        for (Book book : bookCollection) {
            if (book.getCoverType() == "soft") {
                booksWithSoftCover.add(book);
            } else {
                booksWithHardCover.add(book);
            }
        }
        System.out.println(" The store has the following paperback books");
        for (Book book : booksWithSoftCover) {
            System.out.println(book.getTitle());
        }
        System.out.println("The store has the following hardback books");
        for (Book book : booksWithHardCover) {
            System.out.println(book.getTitle());
        }


    }
}

