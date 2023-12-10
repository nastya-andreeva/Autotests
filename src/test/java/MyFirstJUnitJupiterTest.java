import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.misis.nastyusha.Calculator;
import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTest {
    private final Calculator calculator = new Calculator();

    @Test
    void addition() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void subtraction() {assertEquals(3, calculator.sub(5, 2));}

    @Test
    void multiplication() {assertEquals(4, calculator.mul(2, 2));}
}