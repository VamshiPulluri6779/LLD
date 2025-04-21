package DesignPatterns.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao {


    @Override
    public void createEmployee(String userRole, String employeeName) {
        System.out.println("Creating employee " + employeeName);
    }

    @Override
    public void deleteEmployee(String userRole, String employeeId) {
        System.out.println("Deleting employee " + employeeId);
    }

    @Override
    public void getEmployee(String userRole, String employeeId) {
        System.out.println("Getting employee " + employeeId);
    }
}
