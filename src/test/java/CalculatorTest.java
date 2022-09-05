import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator myCalc;

    @Before
    public void before() {myCalc = new Calculator(8, 2, 7.00,2.00);}

    @Test
    public void canAdd(){
        assertEquals(10, myCalc.add());
    }

    @Test
    public void canSubtract(){
        assertEquals(6, myCalc.subtract());
    }

    @Test
    public void canMultiply(){
        assertEquals(16, myCalc.multiply());
    }

    @Test
    public void canDivide(){
        assertEquals(3.50, myCalc.divide(), 0.00);
    }

}
