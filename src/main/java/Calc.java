public class Calc {

    public int payment(double sum, double percent, double creditPeriod) {
        float rate = (float) (percent / 12);
        double pow = (Math.pow((1 + rate), creditPeriod));
        double coefficient = (rate * pow / (pow - 1));
        return (int) (coefficient * sum);
    }

    public int sumPays(double sum, double percent, double creditPeriod) {
        float rate = (float) (percent / 12);
        double pow = (Math.pow((1 + rate), creditPeriod));
        double coefficient = (rate * pow / (pow - 1));
        int testPayment = (int) (coefficient * sum);
        return (int) (testPayment * creditPeriod);
    }

    public int overPay(double sum, double percent, double creditPeriod) {
        float rate = (float) (percent / 12);
        double pow = (Math.pow((1 + rate), creditPeriod));
        double coefficient = (rate * pow / (pow - 1));
        int testPayment = (int) (coefficient * sum);
        int testSumPays = (int) (testPayment * creditPeriod);
        return (int) (testSumPays - sum);
    }
}