package DesignPatterns.ObserverDesign;

public class EmailObserver implements Observer{

    StockObservable observable;
    String email;

    public EmailObserver(StockObservable observable, String email){
        this.observable = observable;
        this.email = email;
    }

    public void update(){
        sendEmailOnStockUpdate();
    }

    private void sendEmailOnStockUpdate() {
        System.out.println("Email has been sent to "+ email);
    }

}
