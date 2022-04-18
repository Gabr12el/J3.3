public class CreditService {
    public int calculate(int loan, int years, double benefit) {//метод
        double monthPay;
//        double month = years * 12 * (-1);
        double monthPercent = benefit / (100 * 12);//метод
        monthPay = loan * (monthPercent / (1 - Math.pow(1 + monthPercent, years * 12 * (-1))));
        return (int) monthPay;
    }
}