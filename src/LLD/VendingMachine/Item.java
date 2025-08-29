package VendingMachine;

public class Item {

    int id;
    ItemType itemType;
    int cost;

    Item(int id, ItemType itemType, int cost){
        this.id = id;
        this.itemType = itemType;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
