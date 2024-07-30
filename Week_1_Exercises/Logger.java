import java.util.*;

public class Logger{
    private static Logger logger;
    private Logger(){}
    public static Logger getter(){
        if(logger==null)
        logger = new Logger();
        return logger;
    }
}