package DesignPatterns.InterpreterDesign;

public class Client {
    public static void main(String[] args) {

        // For complex expression like ((a*b)+(c*d)) - we can have the same non-terminal expression extened to 
        // other operation by passing the operator too

        /** 
        Example :
        new NonTerminalExpression(
            new NonTerminalExpression(new TerminalExpression("a"), new TerminalExpression("b"), '*'),
            new NonTerminalExpression(new TerminalExpression("c"), new TerminalExpression("d"), '*'),
            '+');

        Like above, we can keep on addding the operations in the non-terminal one

        **/
        
        Context context = new Context();
        context.put("a", 20);
        context.put("b", 10);

        AbstractExpression expression = 
                new NonTerminalExpression(new TerminalExpression("a") , new TerminalExpression("b"));

        System.out.println("The output is "+ expression.interpret(context));
    }
}
