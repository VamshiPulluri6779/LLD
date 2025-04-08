package solidprinciples.OpenClosedPrinciple.Satisfy;

public class CreditCard implements Payment {

    public void pay() {
        System.out.println("Payment made using Credit Card");
    }
}
