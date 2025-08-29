package VendingMachine.VendingMachineStates;

import VendingMachine.VendingMachine;

public abstract class State {

    public void cancelTransaction(VendingMachine vendingMachine) {
        vendingMachine.changeState(new IdleState());
        System.out.println("The transaction has been cancelled");
    }

    public void refund(VendingMachine vendingMachine, int amount){
        System.out.println("Collect your money back");
    }

    public void selectProduct(VendingMachine vendingMachine, int amount){
        System.out.println("Operation not supported");
    }

    public void insertChange(VendingMachine vendingMachine){
        System.out.println("Operation not supported");
    }

    public void hasMoney(VendingMachine vendingMachine, int amount){
        System.out.println("Operation not supported");
    }

    public void dispenseChange(VendingMachine vendingMachine, int amount){
        System.out.println("Operation not supported");
    }

    public void dispenseProduct(VendingMachine vendingMachine){
        System.out.println("Operation not supported");
    }
}
