package VendingMachine;

public enum Coin {


    RS50(50), RS100(100);

    final int value;

    Coin(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
