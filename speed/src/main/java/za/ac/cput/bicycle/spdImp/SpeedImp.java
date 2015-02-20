package za.ac.cput.bicycle.spdImp;

import za.ac.cput.bicycle.Speed;

/**
 * Created by student on 2015/02/20.
 */
public class SpeedImp implements Speed {
    int speed;

    public SpeedImp() {
        speed = 0;
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
        speed-= decrement;
    }
}
