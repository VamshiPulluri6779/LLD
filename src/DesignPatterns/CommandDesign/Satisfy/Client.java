package DesignPatterns.CommandDesign.Satisfy;

public class Client {
    public static void main(String[] args) {
        
        AirConditioner ac = new AirConditioner();

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(new TurnAcOnCommand(ac));
        remoteControl.pressButton();
    
        remoteControl.undoOperation();
    }
    
}
