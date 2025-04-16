package DesignPatterns.ObserverDesign;

public class Main {
    public static void main(String[] args){


        StockObservable observable = new IphoneObservable();

        Observer observer1 = new EmailObserver(observable, "abcd@gmail.com");
        Observer observer2 = new MobileObserver(observable, "999999999");

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        // stock got loaded and completed then we reloaded again - hence we get notification 2 times

        observable.setCount(100);

        observable.setCount(0);

        observable.setCount(100);
    }
}
