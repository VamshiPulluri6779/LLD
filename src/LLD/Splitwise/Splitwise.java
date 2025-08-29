package Splitwise;

import java.util.Arrays;

public class Splitwise {
    public static void main(String[] args) {


        UserController userController = new UserController();
        User user1 = userController.createUser(1, "user1");
        User user2 = userController.createUser(2, "user2");

        BalanceSheetController balanceSheetController = new BalanceSheetController();
        balanceSheetController.addBalanceSheet(user1);
        balanceSheetController.addBalanceSheet(user2);
        balanceSheetController.printBalanceSheet(user1);
        balanceSheetController.printBalanceSheet(user2);

        GroupController groupController = new GroupController();
        Group group = groupController.createGroup(1, "Thailand");

        groupController.addUserToGroup(group, user1);
        groupController.addUserToGroup(group, user2);

        Split split1 = new Split(user1, 250);
        Split split2 = new Split(user2, 250);
        Expense expense = new Expense("Food", user1, 500,
                Arrays.asList(split1, split2), SplitType.EQUAL);

        ExpenseController expenseController = new ExpenseController(balanceSheetController);
        expenseController.createExpense(expense);

        balanceSheetController.printBalanceSheet(user1);
        balanceSheetController.printBalanceSheet(user2);
    }
}
