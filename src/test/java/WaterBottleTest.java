import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle myBottle;

    @Before
    public void before(){
        myBottle = new WaterBottle(100);
    }

    @Test
    public void hasFullVolume(){
        assertEquals(100, myBottle.getVolume());
    }

    @Test
    public void canDrink(){
        myBottle.drink();
        assertEquals(90, myBottle.getVolume());
        myBottle.drink();
        assertEquals(80, myBottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        myBottle.empty();
        assertEquals(0, myBottle.getVolume());
    }

    @Test
    public void fillBottle(){
        myBottle.empty();
        assertEquals(0, myBottle.getVolume());
        myBottle.fill();
        assertEquals(100, myBottle.getVolume());
    }

}
