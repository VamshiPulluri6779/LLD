package DesignPatterns.ObserverDesign;


public interface StockObservable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

    void setCount(int data);

    int getCount();
}
