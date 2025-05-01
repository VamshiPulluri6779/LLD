package DesignPatterns.IteratorDesign;

public class Book {

    String bookName;
    int price;

    Book(String bookName, int price){
        this.bookName = bookName;
        this.price = price;
    }
    
    public int getPrice(){
        return price;
    }

    public String getBookName(){
        return bookName;
    }
}
