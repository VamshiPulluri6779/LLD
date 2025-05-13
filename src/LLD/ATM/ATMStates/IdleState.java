package LLD.ATM.ATMStates;

import LLD.ATM.ATM;

public class IdleState extends ATMState {

    public IdleState() {
        System.out.println("ATM is currently in IdleState");
    }

    @Override
    public void insertCard(ATM atm){
        System.out.println("Card is inserted successfully");
        atm.changeState(new InsertedCardState());
    }
}
