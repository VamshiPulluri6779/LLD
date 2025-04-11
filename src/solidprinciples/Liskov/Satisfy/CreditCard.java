package solidprinciples.Liskov.Satisfy;

public class CreditCard extends Payment{
    public void getCredit(){
        System.out.println("Getting credit from card");
    }
}
