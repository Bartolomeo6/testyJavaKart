import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void potega() {
        Assertions.assertEquals(4,Kalkulator.potega(2,2));
    }


    @Test
    void testPotega() {
        Assertions.assertEquals(0.25, Kalkulator.potega(-2,2));
    }

    @Test
    void testPotega1() {
        Assertions.assertEquals(1024,Kalkulator.potega(10,2));
    }
}