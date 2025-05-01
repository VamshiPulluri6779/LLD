package DesignPatterns.FacadeDesign;

public class Client {
    public static void main(String[] args) {

        EmployeeFacade employeeFacade = new EmployeeFacade();
        employeeFacade.getEmployeeFromDB(5);
    }
}
