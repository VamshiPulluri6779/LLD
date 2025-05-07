package DesignPatterns.FlyweightDesign.FailedCase;

public class Main {
    public static void main(String[] args) {

        // Let's create an army of humanoids - 10lakh

        for(int i=0; i<10000000; i++){
            Humanoid humanoid = new Humanoid(i, 2*i, "Humanoid", new Sprites());
        }

        // here the x and y coordinates may be different for each humanoid but the type and sprites object are
        // same - hence we can use it as a shared resource
    }
}
