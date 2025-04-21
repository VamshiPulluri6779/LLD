package DesignPatterns.ProxyDesignPattern;

public class Main {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoProxy(new EmployeeDaoImpl());

        employeeDao.createEmployee("CLIENT", "NEW_USER");
        employeeDao.getEmployee("ADMIN", "123");
    }
}
