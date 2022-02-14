import org.junit.jupiter.api.Test;
import powerpackage.PowerFinder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerTest {
    @Test
    public void checkOneRaisedToOne() {
        PowerFinder powerFinder = new PowerFinder(1,1);
        int result = powerFinder.calculatePower();
        assertEquals(1,result);
    }

    @Test
    public void checkTwoRaisedToOne() {
        PowerFinder powerFinder = new PowerFinder(2,1);
        int result = powerFinder.calculatePower();
        assertEquals(2,result);
    }

    @Test
    public void checkTwoRaisedToTwo() {
        PowerFinder powerFinder = new PowerFinder(2,2);
        int result = powerFinder.calculatePower();
        assertEquals(4,result);
    }

    @Test
    public void checkThreeRaisedToTwo() {
        PowerFinder powerFinder = new PowerFinder(3,2);
        int result = powerFinder.calculatePower();
        assertEquals(9,result);
    }
}
