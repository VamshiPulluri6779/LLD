package Splitwise.SplitFactory;

import Splitwise.Expense;
import Splitwise.Split;

public class UnequalSplitInterface implements SplitInterface {

    public boolean validateRequest(Expense expense){
        double amount = 0;
        for(Split split : expense.getSplits()){
            amount += split.getAmount();
        }

        return amount == expense.getAmount();
    }
}
