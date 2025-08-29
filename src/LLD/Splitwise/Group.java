package Splitwise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {

    int id;
    String title;
    Map<Integer, User> groupMembers;
    List<Expense> expenseList;

    public Group(int id, String title) {
        this.id = id;
        this.title = title;
        this.groupMembers = new HashMap<>();
        this.expenseList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map<Integer, User> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(Map<Integer, User> groupMembers) {
        this.groupMembers = groupMembers;
    }

    public List<Expense> getExpenseList() {
        return expenseList;
    }

    public void setExpenseList(List<Expense> expenseList) {
        this.expenseList = expenseList;
    }
}
