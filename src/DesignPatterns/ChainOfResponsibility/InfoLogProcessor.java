package DesignPatterns.ChainOfResponsibility;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == LogProcessor.INFO) {
            System.out.println("INFO: " + message);
        } else
            super.nextLogProcessor.log(logLevel, message);
    }
}
