package Splitwise;

import java.util.ArrayList;
import java.util.List;

public class Expense {

    String desc;
    User paidBy;
    double amount;
    List<Split> splits;
    SplitType splitType;

    public Expense(String desc, User paidBy, double amount,
                   List<Split> splits, SplitType splitType) {
        this.desc = desc;
        this.paidBy = paidBy;
        this.amount = amount;
        this.splits = splits;
        this.splitType = splitType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public void setSplitType(SplitType splitType) {
        this.splitType = splitType;
    }
}
