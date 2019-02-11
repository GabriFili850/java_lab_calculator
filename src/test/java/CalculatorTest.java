import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }


    @Test
    public void add() {
        assertEquals(7, calculator.calculatorAdd(5, 2));
    }

    @Test
    public void sub() {
        assertEquals(10, calculator.calculatorSub( 30, 20));
    }

    @Test
    public void multiply() {
        assertEquals(45, calculator.calculatorMultiply(9, 5));
    }


}
