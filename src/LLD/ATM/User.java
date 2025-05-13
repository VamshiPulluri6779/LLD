package LLD.ATM;

public class User {

    Card card;
    String name;
    BankAccount bankAccount;

    User(Card card, String name, BankAccount bankAccount) {
        this.card = card;
        this.name = name;
        this.bankAccount = bankAccount;
        this.card.bankAccount = bankAccount;
    }

    public int getCardPin(){
        return card.pin;
    }

    public int getBalance(){
        return bankAccount.balance;
    }
}
