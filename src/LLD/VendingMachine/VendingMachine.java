package VendingMachine;

import VendingMachine.VendingMachineStates.IdleState;
import VendingMachine.VendingMachineStates.State;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachine {

    public State state;
    public Map<Coin, Integer> vendingMachineCurrency;
    Inventory inventory;

    VendingMachine(){
        this.state = new IdleState();
        this.vendingMachineCurrency = new HashMap<>();
        this.inventory = new Inventory();
    }

    public void insertMoneyButton(){
        this.state.insertChange(this);
    }

    public void insertMoney(List<Coin> coins){
        int enteredAmount = 0;
        for(Coin coin : coins){
            vendingMachineCurrency.put(coin,
                    vendingMachineCurrency.getOrDefault(coin, 0)+1);
            enteredAmount += coin.getValue();
        }

        this.state.hasMoney(this, enteredAmount);
    }

    public void selectProduct(int id){
        this.state.selectProduct(this, id);
    }

    public void changeState(State state){
        this.state = state;
    }

    public Inventory getInventory(){
        return this.inventory;
    }
}
