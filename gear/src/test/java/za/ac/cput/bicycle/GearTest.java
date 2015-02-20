package za.ac.cput.bicycle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.bicycle.guerImpl.GearImpl;

/**
 * Created by student on 2015/02/20.
 */
public class GearTest {
    Gear gr;

    @Before
    public void setUp() throws Exception {
        gr = new GearImpl();
    }

    @Test
    public void testGear() throws Exception {
        gr.setGear(5);
        int g1 = gr.getGear();
       // gr.gearUp(2);
        int g2 = gr.getGear();

        Assert.assertEquals(g1,g2);

    }
}
