package LLD.ATM.CashWithdrawalProcessor;

public class OneHunderedProcessor extends CashProcessor{

    public OneHunderedProcessor(CashProcessor nextCashProcessor) {
        super(nextCashProcessor);
    }

    @Override
    public void withdrawCash(int amount) {
        if(amount > 100){
            System.out.println("Dispensing " + amount/100 + " 100 rupees notes");
            super.notes.put("100", amount/100);
            amount = amount % 100;
        }

        if(amount > 0){
            System.err.println("Amount cannot be dispensed "+amount);
        }
    }

}
