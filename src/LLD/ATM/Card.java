package LLD.ATM;

public class Card {

    int CVV;
    int cardNumber;
    int pin;
    BankAccount bankAccount;

    Card(int CVV, int cardNumber, int pin) {
        this.CVV = CVV;
        this.cardNumber = cardNumber;
        this.pin = pin;
    }
}
