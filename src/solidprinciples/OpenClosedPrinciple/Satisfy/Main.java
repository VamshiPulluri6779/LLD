package solidprinciples.OpenClosedPrinciple.Satisfy;


public class Main {
    public static void main(String[] args) {
        PaymentManager paymentManager = new PaymentManager(new DebitCard());
        paymentManager.getPayment();
        paymentManager = new PaymentManager(new CreditCard());
        paymentManager.getPayment();
    }
}
