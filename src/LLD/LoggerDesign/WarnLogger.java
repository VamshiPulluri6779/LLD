package LoggerDesign;

public class WarnLogger extends Logger{

    @Override
    public void log(LogLevel logLevel, String message){
        if(logLevel == LogLevel.WARN)
            System.err.println(message);
    }
}
