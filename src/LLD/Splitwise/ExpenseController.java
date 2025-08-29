package Splitwise;

import Splitwise.SplitFactory.SplitFactory;
import Splitwise.SplitFactory.SplitInterface;

import java.util.HashMap;
import java.util.Map;

public class ExpenseController {

    Map<Integer, Expense> expenseMap;
    BalanceSheetController balanceSheetController;


    ExpenseController(BalanceSheetController balanceSheetController){
        this.expenseMap = new HashMap<>();
        this.balanceSheetController = balanceSheetController;
    }

    public void createExpense(Expense expense){
        SplitInterface splitStrategy = SplitFactory.getSplitType(expense.splitType);

        if(!splitStrategy.validateRequest(expense)){
            throw new RuntimeException("Please give a valid split");
        }

        System.out.println("Create expense for "+expense.desc);

        User userWhoPaid = expense.paidBy;
        BalanceSheet balanceSheetWhoPaid = balanceSheetController.balanceSheetMap.get(userWhoPaid);
        balanceSheetWhoPaid.totalPayments += expense.amount;

        for(Split split : expense.splits){
            BalanceSheet balanceSheet = balanceSheetController.balanceSheetMap.get(split.user);
            balanceSheet.totalExpenses += split.amount;
            if(split.user != userWhoPaid){
                balanceSheetWhoPaid.owedBy += split.amount;
                balanceSheet.owedTo += split.amount;
            }
        }
    }
}
