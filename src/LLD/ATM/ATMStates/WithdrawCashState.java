package LLD.ATM.ATMStates;

import LLD.ATM.ATMController;
import LLD.ATM.CashWithdrawalProcessor.CashProcessor;
import LLD.ATM.CashWithdrawalProcessor.FiveHundredProcessor;
import LLD.ATM.CashWithdrawalProcessor.OneHunderedProcessor;
import LLD.ATM.CashWithdrawalProcessor.TwoKProcessor;

public class WithdrawCashState extends ATMState{

    CashProcessor cashProcessor;


    WithdrawCashState() {
        System.out.println("ATM is currently in WithdrawCashState");
        cashProcessor = new
                TwoKProcessor(new FiveHundredProcessor(new OneHunderedProcessor(null)));
    }

    @Override
    public void withdrawCash(ATMController atmController, int amount) {
        cashProcessor.withdrawCash(amount);
        System.out.println("These are the notes which you got: "+ cashProcessor.notes);
        atmController.atm.changeState(new IdleState());
    }

}
