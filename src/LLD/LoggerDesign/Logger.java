package LoggerDesign;

public abstract class Logger {

    abstract void log(LogLevel logLevel, String message);

    public static Logger getLogger(String logLevel) {
        return switch (logLevel) {
            case "info" -> new InfoLogger();
            case "warn" -> new WarnLogger();
            case "error" -> new ErrorLogger();
            default -> null;
        };
    }
}
