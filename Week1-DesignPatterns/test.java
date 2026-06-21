public class test {
    public static void main(String args[]){
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        if(l1==l2){
            System.out.println("Logger instance exist");
        }
        else{
            System.out.println("Multiple instance existed");
        }
    }
}
