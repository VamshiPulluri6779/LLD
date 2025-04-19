package DesignPatterns.ChainOfResponsibility;

public class WarnLogProcessor extends LogProcessor {

    public WarnLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == LogProcessor.WARN) {
            System.out.println("WARN: " + message);
        } else
            super.nextLogProcessor.log(logLevel, message);
    }
}
