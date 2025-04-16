package DesignPatterns.ObserverDesign;

public class MobileObserver implements Observer{

    String mobileNumber;
    StockObservable observable;

    public MobileObserver(StockObservable stockObservable, String mobileNumber){
        this.observable = stockObservable;
        this.mobileNumber = mobileNumber;
    }

    public void update(){
        sendMobileNotification();
    }

    private void sendMobileNotification() {

        System.out.println("Message has been sent to "+ mobileNumber);
    }
}
