package DesignPatterns.InterpreterDesign;

public class NonTerminalExpression implements AbstractExpression{

    AbstractExpression lefAbstractExpression;
    AbstractExpression righAbstractExpression;

    NonTerminalExpression(AbstractExpression lefAbstractExpression, AbstractExpression righAbstractExpression){
        this.lefAbstractExpression = lefAbstractExpression;
        this.righAbstractExpression = righAbstractExpression;
    }

    @Override
    public int interpret(Context context){
        return lefAbstractExpression.interpret(context) * righAbstractExpression.interpret(context);
    }
    
}
