package DesignPatterns.DecoratorDesign;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Veggies(new ExtraCheese(new Margarita()));

        System.out.println("Cost of pizza: " + pizza.getCost());
    }
}
