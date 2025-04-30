package DesignPatterns.CommandDesign.Satisfy;

import java.util.Stack;

public class RemoteControl {
    
    // you will have a command object here for generating 
    // the command
    ICommand command;
    // stack for storing the events happened, can be useful in
    // undo or redo operations
    Stack<ICommand> operations = new Stack<>();

    RemoteControl(){}

    public void setCommand(ICommand command){
        this.command = command;
        operations.add(command);
    }

    public void pressButton(){
        command.execute();
    }

    // if pressed undo, undo the latest operation
    public void undoOperation(){
        if(!operations.isEmpty()){
            ICommand latestOp = operations.pop();
            latestOp.undo();
        }
    }

}
