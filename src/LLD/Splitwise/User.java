package Splitwise;

public class User {
    int id;
    String name;
    BalanceSheet balanceSheet;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.balanceSheet = new BalanceSheet();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BalanceSheet getBalanceSheet() {
        return balanceSheet;
    }

    public void setBalanceSheet(BalanceSheet balanceSheet) {
        this.balanceSheet = balanceSheet;
    }
}
