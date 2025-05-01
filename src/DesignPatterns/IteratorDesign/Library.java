package DesignPatterns.IteratorDesign;

import java.util.List;

// concrete aggregate which creates the iterator
public class Library implements Aggregate{

    List<Book> booksList;

    Library(List<Book> booksList){
        this.booksList = booksList;
    }

    @Override
    public Iterator createIterator(){
        return new BookIterator(booksList);
    }  
}
