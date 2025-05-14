package LoggerDesign;

public class InfoLogger extends Logger{

    @Override
    public void log(LogLevel logLevel, String message){
        if(logLevel == LogLevel.INFO)
            System.out.println(message);
    }
}
