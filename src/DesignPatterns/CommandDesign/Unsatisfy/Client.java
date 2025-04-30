package DesignPatterns.CommandDesign.Unsatisfy;

public class Client {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();

        // there is no abstraction - if turning ON Ac will have more steps, client should know all of them
        // there is no undo/ redo functionality
        // If any similar object is created, then we have rewrite the same code again
        ac.turnOnAC();
        ac.setTemperature(18);
        ac.turnOffAC();
    }
}
