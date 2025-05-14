package LoggerDesign;


public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("error");

        logger.log(LogLevel.ERROR,"This is error logger");
    }
}
