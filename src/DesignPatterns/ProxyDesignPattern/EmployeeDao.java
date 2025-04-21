package DesignPatterns.ProxyDesignPattern;

public interface EmployeeDao {

    void createEmployee(String userRole, String employeeName);
    void deleteEmployee(String userRole, String employeeId);
    void getEmployee(String userRole, String employeeId);
}
