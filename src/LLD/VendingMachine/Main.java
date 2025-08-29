package VendingMachine;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Item item = new Item(101, ItemType.LAYS, 50);
        Item item2 = new Item(102, ItemType.SPRITE, 100);
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.getInventory().addItem(item);
        vendingMachine.getInventory().addItem(item2);
        vendingMachine.insertMoneyButton();
        vendingMachine.insertMoney(Arrays.asList(Coin.RS50, Coin.RS100));
        vendingMachine.selectProduct(102);
    }
}
