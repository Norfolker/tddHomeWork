import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {
    Calc calc = new Calc();

    @Test
    public void testPayment() {
        double sum = 1500000;
        double percent = 0.19;
        double creditPeriod = 48;
        int testPayment = (int) (sum / creditPeriod * percent);
        int payment = calc.payment(sum, percent, creditPeriod);
        assertEquals(testPayment, payment);
    }

    @Test
    public void testSumPays() {
        double sum = 1500000;
        double percent = 0.19;
        double creditPeriod = 48;
        int testSumPays = (int) (sum * percent * creditPeriod);
        int sumPays = calc.sumPays(sum, percent, creditPeriod);
        assertEquals(testSumPays, sumPays);
    }

    @Test
    public void testOverPay () {
        double sum = 1500000;
        double percent = 0.19;
        double creditPeriod = 48;
        int testOverPay  = (int) (Math.pow(percent, (creditPeriod / 12)) * sum - sum);
        int overPay = calc.overPay(sum, percent, creditPeriod);
        assertEquals(testOverPay, overPay);
    }

}
