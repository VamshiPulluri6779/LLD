package DesignPatterns.VisitorDesign.SatisfiedCase;

public interface HotelElement {
    void accept(RoomVisitor roomVisitor);
}
