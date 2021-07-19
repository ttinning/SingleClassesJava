import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(35, calculator.add(10, 25));
    }

    @Test
    public void canSubtract() {
        assertEquals(15, calculator.subtract(25, 10));
    }

    @Test
    public void canMultiply() {
        assertEquals(250, calculator.multiply(25, 10));
    }

    @Test
    public void canDivide() {
        assertEquals(0.4, calculator.divide(10, 25), 0.01);
    }
}
