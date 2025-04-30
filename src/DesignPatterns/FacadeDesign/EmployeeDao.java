package DesignPatterns.FacadeDesign;

public class EmployeeDao {

    public void insertEmployee() {
        // inserts employee to DB
    }

    public void deleteEmployee(int employeeId){
        // deletes using employeeId
    }

    public void getEmployeeUsingId(int employeeId){
        // gets the employee using the id
        System.out.println("Retrieving employee with id " + employeeId);
    }

    public void updateEmployee(){}
}
