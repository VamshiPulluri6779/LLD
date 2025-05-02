package DesignPatterns.VisitorDesign.SatisfiedCase;

public interface RoomVisitor {
    void visit(SingleRoom singleRoom);
    void visit(DoubleRoom doubleRoom);
}
