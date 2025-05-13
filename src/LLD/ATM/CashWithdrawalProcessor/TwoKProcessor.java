package LLD.ATM.CashWithdrawalProcessor;

public class TwoKProcessor extends CashProcessor{

    public TwoKProcessor(CashProcessor nextCashProcessor) {
        super(nextCashProcessor);
    }

    @Override
    public void withdrawCash(int amount){
        if(amount > 2000){
            System.out.println("Dispensing 2000 notes: " + amount/2000);
            super.notes.put("2000", amount/2000);
            amount = amount % 2000;
        }

        if(amount != 0){
            super.withdrawCash(amount);
        }
    }
}
