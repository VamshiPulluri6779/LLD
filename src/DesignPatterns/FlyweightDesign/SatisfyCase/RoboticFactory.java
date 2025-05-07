package DesignPatterns.FlyweightDesign.SatisfyCase;

import DesignPatterns.FlyweightDesign.FailedCase.Sprites;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {

    static Map<String, IRobot> roboticMap = new HashMap<>();

    public static IRobot createRobot(String robotName) {
        if (roboticMap.containsKey(robotName)) {
            return roboticMap.get(robotName);
        }
        else if(robotName.equals("Humanoid")){
            Sprites body = new Sprites();
            IRobot humanoid = new Humanoid(robotName, body);
            roboticMap.put(robotName, humanoid);
            return humanoid;
        } else {
            Sprites body = new Sprites();
            IRobot roboticDog = new RoboticDog(robotName, body);
            roboticMap.put(robotName, roboticDog);
            return roboticDog;
        }
    }
}
