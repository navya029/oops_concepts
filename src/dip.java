interface ILogger{
    public void logInformation(String logInfo);
}
class Logger implements ILogger{
    public void logInformation(String logInfo){
        System.out.println(logInfo);

    }

}
class LoggingToFile{
    private ILogger logger;
    public LoggingToFile(ILogger l){
        this.logger=l;
    }
    public void logging(){
        logger.logInformation("printing logs to file");

    }
}
public class dip{
    public static void main(String[] args)
    {
        LoggingToFile fileLogger=new LoggingToFile(new Logger());
    fileLogger.logging();
    }
}