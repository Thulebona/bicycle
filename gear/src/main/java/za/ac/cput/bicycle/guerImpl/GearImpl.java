package za.ac.cput.bicycle.guerImpl;

import za.ac.cput.bicycle.Gear;

/**
 * Created by student on 2015/02/20.
 */
public class GearImpl implements Gear {

    int gear;
    @Override
    public void setGear(int newGear) {
        gear = newGear;
    }

    @Override
    public int getGear() {
        return gear;
    }

    @Override
    public void gearUp(int increment) {
        gear += increment;
    }
}
