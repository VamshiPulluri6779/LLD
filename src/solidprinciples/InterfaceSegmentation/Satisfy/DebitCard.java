package solidprinciples.InterfaceSegmentation.Satisfy;

public class DebitCard implements CheckBalance{

    //we only need to implement methods which are necessary only
    @Override
    public void checkBalance() {
        System.out.println("DebitCard check balance");
    }
}
