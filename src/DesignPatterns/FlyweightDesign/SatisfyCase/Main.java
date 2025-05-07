package DesignPatterns.FlyweightDesign.SatisfyCase;

public class Main {
    public static void main(String[] args) {

        IRobot humanoid1 = RoboticFactory.createRobot("Humanoid");
        humanoid1.display(1,2);

        IRobot humanoid2 = RoboticFactory.createRobot("Humanoid");
        // this time instead of creating it, we will reuse it from cache
        humanoid2.display(1,2);
    }
}
