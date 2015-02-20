package za.ac.cput.bicycle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.bicycle.spdImp.SpeedImp;

/**
 * Created by student on 2015/02/20.
 */
public class SpeedTest {

    Speed spd;

    @Before
    public void setUp() throws Exception {
        spd = new SpeedImp();
    }

    @Test
    public void testSpeed() throws Exception {
        spd.setSpeed(5);
        int s1= spd.GetSpeed();
       // spd.speedDown(2);
        int s2 = spd.GetSpeed();

        Assert.assertEquals(s1,s2);
    }
}
