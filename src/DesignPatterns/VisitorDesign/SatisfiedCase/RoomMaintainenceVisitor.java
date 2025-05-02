package DesignPatterns.VisitorDesign.SatisfiedCase;

public class RoomMaintainenceVisitor implements RoomVisitor{

    @Override
    public void visit(SingleRoom singleRoom){
        System.out.println("Doing maintainence for single room");
    }

    @Override
    public void visit(DoubleRoom doubleRoom){
        System.out.println("Doing maintainence for double room");
    }
    
}
