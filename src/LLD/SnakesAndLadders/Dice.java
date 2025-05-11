package LLD.SnakesAndLadders;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    int diceCount;
    int maxDiceValue = 6;
    int minDiceValue = 1;

    public Dice(int diceCount){
        this.diceCount = diceCount;
    }

    public int rollDice(){

        int diceValue = 0;

        while(diceCount > 0){
            diceValue += ThreadLocalRandom.current().nextInt(minDiceValue, maxDiceValue);
            diceCount--;
        }
        return diceValue;
    }
}
