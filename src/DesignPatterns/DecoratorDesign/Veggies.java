package DesignPatterns.DecoratorDesign;

public class Veggies implements ToppingDecorator {

    Pizza pizza;

    public Veggies(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getCost() {
        return pizza.getCost() + 25;
    }
}
