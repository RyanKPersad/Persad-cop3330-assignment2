package Assignment2.Ex36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatingStatsTest {

    @Test
    void average() {
        CalculatingStats s = new CalculatingStats();
        s.print();
        assert s.average() == 400.0;
        System.out.println("The average is "+s.average());
    }

    @Test
    void max() {
        CalculatingStats s = new CalculatingStats();
        s.print();
        assert s.max() == 1000.0;
        System.out.println("The max is "+s.max());
    }

    @Test
    void min() {
        CalculatingStats s = new CalculatingStats();
        s.print();
        assert s.average() == 100.0;
        System.out.println("The min is "+s.min());
    }

    @Test
    void SD() {
        CalculatingStats s = new CalculatingStats();
        s.print();
        assert s.SD() == 353.55;
        System.out.println("The SD is "+s.SD());
    }
}