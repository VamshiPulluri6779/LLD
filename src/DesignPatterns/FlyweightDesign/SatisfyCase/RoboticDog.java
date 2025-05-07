package DesignPatterns.FlyweightDesign.SatisfyCase;

import DesignPatterns.FlyweightDesign.FailedCase.Sprites;

public class RoboticDog implements IRobot{

    // putting these private as they can create only once
    private String type;
    private Sprites body;

    RoboticDog(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x, int y){
        // render the image at the given coordinates
    }
}
