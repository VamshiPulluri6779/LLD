package DesignPatterns.VisitorDesign.SatisfiedCase;

public class Main {
    public static void main(String[] args) {
        
        HotelElement singleRoom = new SingleRoom();
        HotelElement doubleRoom = new DoubleRoom();

        RoomVisitor roomVisitor = new HotelPriceVisitor();
        singleRoom.accept(roomVisitor);

        System.out.println("Price for single room is "+ ((SingleRoom)singleRoom).price);
        doubleRoom.accept(roomVisitor);

        System.out.println("Price for single room is "+ ((DoubleRoom)doubleRoom).price);

    }
}
