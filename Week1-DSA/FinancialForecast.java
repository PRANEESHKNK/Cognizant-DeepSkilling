import java.util.Scanner;
public class FinancialForecast {
    public static double predictFutureValue(double presentValue,double growthRate,int years){
        if(years==0){
            return presentValue;
        }
        return predictFutureValue(presentValue,growthRate,years-1)*(1+growthRate);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double presentValue=sc.nextDouble();
        double growthRate = sc.nextDouble();
        int years=sc.nextInt();
        double futureValue = predictFutureValue(presentValue,growthRate,years);
        System.out.println("Future Value - "+futureValue);
    }
    
}
