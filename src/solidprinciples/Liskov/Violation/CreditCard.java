package solidprinciples.Liskov.Violation;

public class CreditCard implements Payment {

    public void getCredit() {
        System.out.println("Credit Card Credit");
    }

    public void checkBalance() {
        System.out.println("Credit Card Balance");
    }
}
