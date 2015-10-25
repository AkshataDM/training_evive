/**
 * Created by akshata on 18/10/15.
 */
public class ExampleInheritance {
    public int cadence;
    public int gear;
    public int speed;

    public ExampleInheritance(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void printClass() {
        System.out.println("This is super class");
    }
}



