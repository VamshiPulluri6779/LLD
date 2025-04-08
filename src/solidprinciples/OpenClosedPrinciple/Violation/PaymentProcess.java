package solidprinciples.OpenClosedPrinciple.Violation;

public class PaymentProcess {

    void processPayment(String paymentType){
        if(paymentType.equals("creditCard")){
            System.out.println("Processing credit card payment");
        }else if(paymentType.equals("debitCard")){
            System.out.println("Processing debit card payment");
        }

        // violates open closed as we can modify the live prd code if we have more payment methods
    }
}
