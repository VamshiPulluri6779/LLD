package solidprinciples.Liskov.Satisfy;

public class Main {
    public static void main(String[] args) {
        Payment payment = new DebitCard();

        payment.checkBalance();
        /*
        won't allow getCredit() method to be called for Debit card as it is not present in DebitCard
         - ending up in compile time error
         payment.getCredit();
         */
    }
}
