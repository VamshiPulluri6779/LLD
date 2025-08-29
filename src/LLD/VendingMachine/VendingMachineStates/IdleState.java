package VendingMachine.VendingMachineStates;

import VendingMachine.VendingMachine;

public class IdleState extends State{

    @Override
    public void insertChange(VendingMachine vendingMachine){
        System.out.println("Vending machine is in idle state");
        vendingMachine.changeState(new AcceptedMoneyState());
        System.out.println("Please insert the change");
    }
}
