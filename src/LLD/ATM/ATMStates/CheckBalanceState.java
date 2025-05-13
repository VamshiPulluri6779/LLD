package LLD.ATM.ATMStates;

import LLD.ATM.ATM;
import LLD.ATM.ATMController;

public class CheckBalanceState extends ATMState {

    public CheckBalanceState(ATMController atmController) {
        System.out.println("ATM is currently in check balance state");
        checkBalance(atmController);
    }

    @Override
    public void checkBalance(ATMController atmController){
        System.out.println("Your balance is: " + atmController.user.getBalance());
        returnCard();
        atmController.atm.changeState(new IdleState());
    }
}
