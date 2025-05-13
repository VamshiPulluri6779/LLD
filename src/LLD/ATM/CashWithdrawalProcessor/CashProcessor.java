package LLD.ATM.CashWithdrawalProcessor;

import java.util.HashMap;

public abstract class CashProcessor {

    CashProcessor nextCashProcessor;
    public HashMap<String, Integer> notes;

    public CashProcessor(CashProcessor nextCashProcessor) {
        this.nextCashProcessor = nextCashProcessor;
        notes = new HashMap<>();
    }

    public void withdrawCash(int amount) {
        if(nextCashProcessor != null) {
            nextCashProcessor.withdrawCash(amount);
        } else throw new RuntimeException("Cash not available");
    }
}
