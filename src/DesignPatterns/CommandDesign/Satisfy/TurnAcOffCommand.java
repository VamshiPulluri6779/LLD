package DesignPatterns.CommandDesign.Satisfy;

public class TurnAcOffCommand implements ICommand{

    AirConditioner airConditioner;

    TurnAcOffCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute(){
        airConditioner.turnOffAC();
    }

    @Override
    public void undo(){
        airConditioner.turnOnAC();
    }
    
}
