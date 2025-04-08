package solidprinciples.OpenClosedPrinciple.Satisfy;

public class DebitCard implements Payment {

    public void pay() {
        System.out.println("Payment made using Debit Card");
    }
}
