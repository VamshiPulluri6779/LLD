package DesignPatterns.compositeDesignPattern.ArithmeticExpression;

public class Main {
    public static void main(String[] args) {
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression five = new Number(5);
        ArithmeticExpression three = new Number(3);

        ArithmeticExpression first = new ArithmeticOperation(one, five, Operator.ADD);
        ArithmeticExpression second = new ArithmeticOperation(first, three, Operator.MULTIPLY);

        System.out.println(second.evaluate());
    }
}
