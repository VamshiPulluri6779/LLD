package DesignPatterns.compositeDesignPattern.ArithmeticExpression;



public class ArithmeticOperation implements ArithmeticExpression{

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operator operator;

    public ArithmeticOperation(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operator operator) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }

    public int evaluate(){
        switch(operator){
            case ADD -> {
                return leftExpression.evaluate() + rightExpression.evaluate();
            }
            case SUBTRACT -> {
                return leftExpression.evaluate() - rightExpression.evaluate();
            }
            case MULTIPLY -> {
                return leftExpression.evaluate() * rightExpression.evaluate();
            }
            case DIVIDE -> {
                return leftExpression.evaluate() / rightExpression.evaluate();
            }
        }
        return 0;
    }
}
