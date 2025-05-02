package DesignPatterns.VisitorDesign.SatisfiedCase;

public class HotelPriceVisitor implements RoomVisitor{
    

    @Override
    public void visit(SingleRoom singleRoom){
        System.out.println("Setting price for single room");
        singleRoom.price = 2000;
    }

    @Override
    public void visit(DoubleRoom doubleRoom){
        System.out.println("Setting price for single room");
        doubleRoom.price = 4000;
    }
}
