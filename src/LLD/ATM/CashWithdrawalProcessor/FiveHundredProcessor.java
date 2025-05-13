package LLD.ATM.CashWithdrawalProcessor;

public class FiveHundredProcessor extends CashProcessor{

    public FiveHundredProcessor(CashProcessor nextCashProcessor) {
        super(nextCashProcessor);
    }

    @Override
    public void withdrawCash(int amount) {
        if(amount > 500){
            System.out.println("Dispensing 500 notes: " + amount/500);
            super.notes.put("500", amount/500);
            amount = amount % 500;
        }
        if(amount != 0){
            super.withdrawCash(amount);
        }
    }
}
