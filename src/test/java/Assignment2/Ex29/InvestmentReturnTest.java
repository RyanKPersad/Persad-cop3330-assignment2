package Assignment2.Ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestmentReturnTest {

    @Test
    void investment() {
        InvestmentReturn IR = new InvestmentReturn();

        double expected  = IR.investment("4");
        double actual = 18;

        assertEquals(expected,actual);
    }

    @Test
    void investment2() {
        InvestmentReturn IR = new InvestmentReturn();

        double expected  = IR.investment("15");
        double actual = 4.8;

        assertEquals(expected,actual);
    }
    @Test
    void investment3() {
        InvestmentReturn IR = new InvestmentReturn();

        double expected  = IR.investment("100");
        double actual = .72;

        assertEquals(expected,actual);
    }
}