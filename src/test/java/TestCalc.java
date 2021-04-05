import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {
    Calc calc = new Calc();

    @Test
    public void testPayment() {
        double sum = 1500000;
        float percent = (float) 0.19;
        double creditPeriod = 48;
        float rate = percent / 12;
        double pow = (Math.pow((1 + rate), creditPeriod));
        double coefficient = (rate * pow / (pow - 1));
        int testPayment = (int) (coefficient * sum);
        int payment = calc.payment(sum, percent, creditPeriod);
        assertEquals(testPayment, payment);
    }

    @Test
    public void testSumPays() {
        double sum = 1500000;
        float percent = (float) 0.19;
        double creditPeriod = 48;
        float rate = percent / 12;
        double pow = (Math.pow((1 + rate), creditPeriod));
        double coefficient = (rate * pow / (pow - 1));
        int testPayment = (int) (coefficient * sum);
        int testSumPays = (int) (testPayment * creditPeriod);
        int sumPays = calc.sumPays(sum, percent, creditPeriod);
        assertEquals(testSumPays, sumPays);
    }

    @Test
    public void testOverPay () {
        double sum = 1500000;
        float percent = (float) 0.19;
        double creditPeriod = 48;
        float rate = percent / 12;
        double pow = (Math.pow((1 + rate), creditPeriod));
        double coefficient = (rate * pow / (pow - 1));
        int testPayment = (int) (coefficient * sum);
        int testSumPays = (int) (testPayment * creditPeriod);
        int testOverPay  = (int) (testSumPays - sum);
        int overPay = calc.overPay(sum, percent, creditPeriod);
        assertEquals(testOverPay, overPay);
    }

}
