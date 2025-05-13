package LLD.ATM.ATMStates;

import LLD.ATM.ATM;
import LLD.ATM.ATMController;
import LLD.ATM.User;

public class InsertedCardState extends ATMState {

    public static final String RED = "\033[0;31m";

    public static final String RESET = "\033[0m";

    InsertedCardState() {
        System.out.println("Card is inserted and ATM is in InsertedCardState");
    }

    @Override
    public void authenticatePin(ATMController atmController, int enteredPin) {
        if(atmController.user.getCardPin() == enteredPin) {
            System.out.println("You are authenticated");
            atmController.atm.changeState(new SelectOperationState());
        } else{
            System.out.println(RED + "You have entered the wrong pin" + RESET);
            returnCard();
            atmController.atm.changeState(new IdleState());
        }
    }
}
