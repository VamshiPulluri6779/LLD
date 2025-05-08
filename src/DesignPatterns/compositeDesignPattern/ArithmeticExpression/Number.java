package DesignPatterns.compositeDesignPattern.ArithmeticExpression;

public class Number implements ArithmeticExpression{

    int value;

    public Number(int value) {
        this.value = value;
    }

    public int evaluate(){
        return value;
    }
}
