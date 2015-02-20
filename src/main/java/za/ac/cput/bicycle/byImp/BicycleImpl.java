package za.ac.cput.bicycle.byImp;

import za.ac.cput.bicycle.BicycleInter;

/**
 * Created by student on 2015/02/20.
 */
public class BicycleImpl implements BicycleInter {

    int speed;
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

    @Override
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    @Override
    public int GetSpeed() {
        return speed;
    }

    @Override
    public void speedDown(int decrement) {
        speed -=decrement;
    }
}
