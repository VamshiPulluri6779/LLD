package DesignPatterns.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new WarnLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "This is an error message");
        logProcessor.log(LogProcessor.WARN, "This is a warning message");
        logProcessor.log(LogProcessor.INFO, "This is an info message");


    }
}
