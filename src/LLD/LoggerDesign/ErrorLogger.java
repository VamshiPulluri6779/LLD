package LoggerDesign;

public class ErrorLogger extends Logger{

    @Override
    public void log(LogLevel logLevel, String message){
        if(logLevel == LogLevel.ERROR)
            System.err.println(message);
    }
}
