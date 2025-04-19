package DesignPatterns.ChainOfResponsibility;


public abstract class LogProcessor {

    static int INFO = 1;
    static int WARN = 2;
    static int ERROR = 3;

    public LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int logLevel, String message){
        if(nextLogProcessor != null){
            nextLogProcessor.log(logLevel, message);
        } else System.out.println("Your log can't be processed");
    }
}
