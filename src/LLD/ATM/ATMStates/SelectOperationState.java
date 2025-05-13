package LLD.ATM.ATMStates;

import LLD.ATM.ATM;
import LLD.ATM.ATMController;

public class SelectOperationState extends ATMState {

    public SelectOperationState() {
        System.out.println("ATM is currently in select operation state");
    }

    @Override
    public void selectOperation(ATMController atmController, String operation){

        switch(operation){
            case "Check Balance":
                atmController.atm.changeState(new CheckBalanceState(atmController));
                break;
            case "Withdraw Cash":
                atmController.atm.changeState(new WithdrawCashState());
                break;
            default:
                System.out.println("Invalid operation");
                returnCard();
                atmController.atm.changeState(new IdleState());
        }
    }
}
