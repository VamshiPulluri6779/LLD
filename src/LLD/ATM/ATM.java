package LLD.ATM;

import LLD.ATM.ATMStates.ATMState;
import LLD.ATM.ATMStates.IdleState;

public class ATM {

    ATMState atmState;

    public ATM() {
        this.atmState = new IdleState();
    }

    public void changeState(ATMState newState) {
        atmState = newState;
    }
}
