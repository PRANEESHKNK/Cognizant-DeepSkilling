public class Logger{
    private Logger(){
        System.out.println("Logger is Created");

    }
    private static Logger instance;
    public static Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }
}
