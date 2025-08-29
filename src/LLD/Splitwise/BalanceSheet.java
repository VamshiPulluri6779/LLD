package Splitwise;

public class BalanceSheet {

    double totalPayments;
    double totalExpenses;
    double owedTo;
    double owedBy;

    BalanceSheet(){
        this.owedTo = 0;
        this.owedBy = 0;
        this.totalExpenses = 0;
        this.totalPayments = 0;
    }
}
