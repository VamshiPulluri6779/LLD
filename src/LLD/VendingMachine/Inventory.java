package VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    Map<Integer, Item> products;

    Inventory(){
        this.products = new HashMap<>();
    }

    public Map<Integer, Item> getProducts(){
        return this.products;
    }

    public void addItem(Item item){
        this.products.put(item.id, item);
    }
}
