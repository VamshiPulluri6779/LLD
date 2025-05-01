package DesignPatterns.IteratorDesign;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("ABCD", 100));
        bookList.add(new Book("EFGH", 200));
        bookList.add(new Book("IJKL", 300));
        bookList.add(new Book("MNOP", 400));
        bookList.add(new Book("XYZ", 500));

        Aggregate library = new Library(bookList);
        Iterator iterator = library.createIterator();

        while(iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());
        }

    }
    
}
