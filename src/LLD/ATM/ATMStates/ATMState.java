package LLD.ATM.ATMStates;

import LLD.ATM.ATM;
import LLD.ATM.ATMController;
import LLD.ATM.User;

public abstract class ATMState {

    public void insertCard(ATM atm) { throw new UnsupportedOperationException("Not supported yet."); }

    public void authenticatePin(ATMController atmController, int pin){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void selectOperation(ATMController atmController, String operation){ throw new UnsupportedOperationException("Not supported yet.");}

    public void performOperation(){ throw new UnsupportedOperationException("Not supported yet.");}

    public void returnCard(){
        System.out.println("Please collect your card back");
    }

    public void cancelTransaction(){ throw new UnsupportedOperationException("Not supported yet.");}

    public void checkBalance(ATMController atmController){ throw new UnsupportedOperationException("Not supported yet.");}

    public void withdrawCash(ATMController atmController,int amount){ throw new UnsupportedOperationException("Not supported yet.");}
}
