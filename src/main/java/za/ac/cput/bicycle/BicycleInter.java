package za.ac.cput.bicycle;

/**
 * Created by student on 2015/02/20.
 */
public interface BicycleInter {

    public void setGear(int newGear);
    public int getGear();
    public void gearUp(int increment);

    void setSpeed(int newSpeed);
    int  GetSpeed();
    void speedDown(int decrement );
}
