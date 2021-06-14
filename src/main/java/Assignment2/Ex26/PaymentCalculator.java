package Assignment2.Ex26;

public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double balance, double APR, double payment){
        double ceil;
        double percentage = APR/100;
        double daily_rate = percentage/365;
        double a = 1 + daily_rate;
        double b = Math.pow(a,30);
        double c = 1-b;
        double d = balance/payment;
        double e = d*c;
        double f = 1 + e;
        double g = Math.log(f);
        double h = Math.log(a);
        double i = Math.pow(-30,-1);
        double j = g/h;
        double answer = i*j;
        ceil = Math.ceil(answer);

        return ceil;
    }

    
}
