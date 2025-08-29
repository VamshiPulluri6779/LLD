package VendingMachine.VendingMachineStates;

import VendingMachine.VendingMachine;
import VendingMachine.Coin;

public class DispenseState extends State{

    @Override
    public void dispenseChange(VendingMachine vendingMachine, int amount){
        System.out.println("Vending machine is in dispense state");
        System.out.println("Dispensed "+amount+" back to customer");
        for(Coin coin : vendingMachine.vendingMachineCurrency.keySet()) {
            vendingMachine.vendingMachineCurrency.put(coin, amount/ coin.getValue());
            amount -= coin.getValue() * (amount/ coin.getValue());
        }
    }
}
