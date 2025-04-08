package solidprinciples.OpenClosedPrinciple.Satisfy;

public class PaymentManager {

    Payment payment;

    public PaymentManager(Payment payment) {
        this.payment = payment;
    }

    void getPayment() {
        payment.pay();
    }
}
