package DesignPatterns.IteratorDesign;

public interface Iterator {
    
    boolean hasNext();
    Object next(); // we put return type as object because we can 
                   // any iterator of data T
}
