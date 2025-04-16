package DesignPatterns.ObserverDesign;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{
    int numberOfDevices;

    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers(){
        for(Observer observer: observers){
            observer.update();
        }
    }

    public void setCount(int newCount) {
        numberOfDevices = newCount;
        if(numberOfDevices > 0 ) notifyObservers();
    }

    public int getCount(){
        return numberOfDevices;
    }

}
