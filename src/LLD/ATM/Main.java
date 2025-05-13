package LLD.ATM;

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();

        Card card= new Card(789,12345678,1234);
        BankAccount bankAccount = new BankAccount(12345678, 19700);
        User user = new User(card,"John Doe",bankAccount);

        ATMController atmController = new ATMController(atm, user);

        atm.atmState.insertCard(atm);

        atm.atmState.authenticatePin(atmController, 1234);

        atm.atmState.selectOperation(atmController, "Check Balance");
    }
}
