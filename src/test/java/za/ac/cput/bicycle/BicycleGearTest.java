package za.ac.cput.bicycle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.bicycle.byImp.BicycleImpl;

/**
 * Created by student on 2015/02/20.
 */
public class BicycleGearTest  {

    BicycleInter byc;

    @Before
    public void setUp() throws Exception {
        byc = new BicycleImpl();
    }

    @Test
    public void testBicycle() throws Exception {

        byc.setGear(5);
        int bGr1 = byc.getGear();
        byc.gearUp(1);
        int bGr2 = byc.getGear();

        Assert.assertEquals(bGr1+1 , bGr2 );
    }
}
