package DesignPatterns.InterpreterDesign;

public class TerminalExpression  implements AbstractExpression{
    String expression;

    TerminalExpression(String expression){
        this.expression = expression;
    }

    @Override
    public int interpret(Context context){
        return context.get(expression);
    }
}
