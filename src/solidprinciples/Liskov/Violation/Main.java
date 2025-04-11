package solidprinciples.Liskov.Violation;

public class Main {
    public static void main(String[] args) {
        Payment payment = new DebitCard();

        payment.checkBalance();
        payment.getCredit(); // will allow getCredit() method in compile time too as it is part of interface
    }
}
