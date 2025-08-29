package VendingMachine.VendingMachineStates;

import VendingMachine.VendingMachine;

public class AcceptedMoneyState extends State{

    @Override
    public void hasMoney(VendingMachine vendingMachine, int amount){
        System.out.println("Vending machine is in accepted money state");
        System.out.println("You have inserted Rs." + amount + " into the machine");
        vendingMachine.changeState(new SelectionState(amount));
    }
}
