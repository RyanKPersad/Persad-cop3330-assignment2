package Assignment2.Ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator pc = new PaymentCalculator();
        Double Expected = pc.calculateMonthsUntilPaidOff(5000,12,100);
        Double Actual = Double.valueOf(70);

        assertEquals(Expected,Actual);

    }
}