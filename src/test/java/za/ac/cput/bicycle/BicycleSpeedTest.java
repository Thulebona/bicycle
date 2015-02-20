package za.ac.cput.bicycle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.bicycle.byImp.BicycleImpl;

/**
 * Created by student on 2015/02/20.
 */
public class BicycleSpeedTest {

    BicycleInter byc;

    @Before
    public void setUp() throws Exception {
        byc = new BicycleImpl();
    }

    @Test
    public void testBicycle() throws Exception {

        byc.setSpeed(10);
        int bSpd1 = byc.GetSpeed();
        byc.speedDown(1);
        int bSpd2 = byc.GetSpeed();

        Assert.assertEquals(bSpd1,bSpd2+1);

    }
}
