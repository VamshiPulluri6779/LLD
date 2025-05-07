package DesignPatterns.FlyweightDesign.FailedCase;

public class Humanoid {

    int Xcoordinate;
    int Ycoordinate;
    String type;
    Sprites body;        // a graphical representation or animation, normally a huge file

    Humanoid(int Xcoordinate, int Ycoordinate, String type, Sprites body) {
        this.Xcoordinate = Xcoordinate;
        this.Ycoordinate = Ycoordinate;
        this.type = type;
        this.body = body;
    }
}
