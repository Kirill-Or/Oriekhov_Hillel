package Hw9;

import Hw8.POJO.Book;

import java.util.ArrayList;

public class BookWithException {
    public static void main(String[] args) {
        ArrayList<Book> booksWithException = new ArrayList<>();
        booksWithException.add(new Book(5.0, " American Tragedy", "hard", 500));
        booksWithException.add(new Book(5.5, " Anatomy", "hard", 100));
        booksWithException.add(new Book(4.0, " 451 degrees Fahrenheit", "soft", 200));
        booksWithException.add(new Book(4.5, " Green Mile ", "hard", 150));
        booksWithException.add(new Book(3.0, " Harry Potter", "hard", 144));

       try {
           System.out.println(booksWithException.get(5).getCoverType());
       }catch (IndexOutOfBoundsException e) {
           System.out.println("Enter valid index");
       }



    }
}
