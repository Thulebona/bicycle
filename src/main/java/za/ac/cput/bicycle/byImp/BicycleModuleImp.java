package za.ac.cput.bicycle.byImp;

import za.ac.cput.bicycle.BicycleInter;
import za.ac.cput.bicycle.Gear;
import za.ac.cput.bicycle.Speed;
import za.ac.cput.bicycle.guerImpl.GearImpl;
import za.ac.cput.bicycle.spdImp.SpeedImp;

/**
 * Created by student on 2015/02/20.
 */
public class BicycleModuleImp implements BicycleInter {
    int speed;
    int gear;
    private Speed spd = new SpeedImp();
    private Gear gr = new GearImpl();
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
