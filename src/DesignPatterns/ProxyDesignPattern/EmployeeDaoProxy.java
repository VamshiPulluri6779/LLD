package DesignPatterns.ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao {

    EmployeeDao employeeDao;

    EmployeeDaoProxy(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void createEmployee(String userRole, String employeeName) {
        if(userRole.equals("ADMIN")){
            employeeDao.createEmployee(userRole, employeeName);
        } else System.out.println("Access Denied");
    }

    @Override
    public void deleteEmployee(String userRole, String employeeId) {
        if(userRole.equals("ADMIN")){
            employeeDao.deleteEmployee(userRole, employeeId);
        } else System.out.println("Access Denied");
    }

    @Override
    public void getEmployee(String userRole, String employeeId) {
        if(userRole.equals("ADMIN")){
            employeeDao.getEmployee(userRole, employeeId);
        } else System.out.println("Access Denied");
    }
}
