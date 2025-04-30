package DesignPatterns.FacadeDesign;

public class EmployeeFacade {

    EmployeeDao employeeDao;

    EmployeeFacade() {
        employeeDao = new EmployeeDao();
    }

    public void insertEmployeeToDB(){
        employeeDao.insertEmployee();
    }

    public void getEmployeeFromDB(int id){
        employeeDao.getEmployeeUsingId(id);
    }
}
