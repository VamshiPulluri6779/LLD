package DesignPatterns.IteratorDesign;

import java.util.List;

public class BookIterator implements Iterator{

    private int index = 0;
    List<Book> booksList;

    BookIterator(List<Book> booksList){
        this.booksList = booksList;
    }
    
    @Override
    public boolean hasNext(){
        return index < booksList.size();
    }

    @Override
    public Object next(){
        if(hasNext()){
            return booksList.get(index++);
        }
        return null;
    }
}
