package DesignPatterns.DecoratorDesign;

public class ExtraCheese implements ToppingDecorator {

    Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getCost() {
        return this.pizza.getCost() + 10;
    }
}
