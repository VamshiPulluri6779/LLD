package DesignPatterns.VisitorDesign.SatisfiedCase;

public class SingleRoom implements HotelElement{
    
    double price;

    @Override
    public void accept(RoomVisitor roomVisitor){
        roomVisitor.visit(this);
    }
}
