public class testLogger{
    public static void main(String args[]){
        Logger logger1 = Logger.getter();
        Logger logger2 = Logger.getter();
        if(logger1==logger2)
        System.out.println("Both are same.");
    }
}