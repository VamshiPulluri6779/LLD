package VendingMachine.VendingMachineStates;

import VendingMachine.VendingMachine;
import VendingMachine.Item;

public class SelectionState extends State{

    int amount;

    SelectionState(int amount){
        this.amount = amount;
    }

    public void selectProduct(VendingMachine vendingMachine, int productId){
        System.out.println("Vending machine is in select product state");
        Item item = vendingMachine.getInventory().getProducts().get(productId);

        if(this.amount < item.getCost()) {
            refund(vendingMachine, amount);
            throw new RuntimeException("Not sufficient money inserted");
        } else{
            vendingMachine.getInventory().getProducts().remove(productId);
            vendingMachine.changeState(new DispenseState());
            vendingMachine.state.dispenseChange(vendingMachine, amount - item.getCost());
        }
    }
}
