package solidprinciples.InterfaceSegmentation.Violation;

public class DebitCard implements Payment{

    @Override
    public void CheckBalance() {
        System.out.println("Debit Card Balance");
    }

    @Override
    public void payBill(){
        // does nothing but should just implement
    }

    @Override
    public void getCredit(){
        // does nothing but should just implement
    }
}
