import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void isFull() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canDrinkWater() {
        assertEquals(90, waterBottle.drinkWater());
    }

    @Test
    public void canEmptyWaterBottle() {
        assertEquals(0, waterBottle.emptyWater());
    }

    @Test
    public void canFillEmptyWaterBottle() {
        assertEquals(90, waterBottle.drinkWater());
        assertEquals(80, waterBottle.drinkWater());
        assertEquals(0, waterBottle.emptyWater());
        assertEquals(100, waterBottle.fillWater());
    }

}
