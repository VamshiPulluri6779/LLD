package DesignPatterns.CommandDesign.Satisfy;

public class TurnAcOnCommand implements ICommand{

    // you will have a receiver object
    AirConditioner airConditioner;

    TurnAcOnCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute(){
        airConditioner.turnOnAC();
    }

    // undo operation for ON is OFF
    @Override
    public void undo(){
        airConditioner.turnOffAC();
    }
    
}
