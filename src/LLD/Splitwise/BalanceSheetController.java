package Splitwise;

import java.util.HashMap;
import java.util.Map;

public class BalanceSheetController {

    Map<User, BalanceSheet> balanceSheetMap;

    BalanceSheetController(){
        this.balanceSheetMap = new HashMap<>();
    }

    public void addBalanceSheet(User user){
        this.balanceSheetMap.put(user, user.balanceSheet);
    }


    public void printBalanceSheet(User user) {
        System.out.println("Total Payments "+user.balanceSheet.totalPayments);
        System.out.println("Total Expenses "+user.balanceSheet.totalExpenses);
        System.out.println("Total Owed By others "+user.balanceSheet.owedBy);
        System.out.println("Total Owed To others "+user.balanceSheet.owedTo);
    }
}
