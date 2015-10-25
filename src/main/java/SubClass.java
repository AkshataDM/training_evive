/**
 * Created by akshata on 18/10/15.
 */
public class SubClass extends ExampleInheritance {


    public int seatHeight;

    public SubClass(int startHeight,
                    int startCadence,
                    int startSpeed,
                    int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
        System.out.println(seatHeight);
    }
    public void printFn() {
        System.out.println("Print function of subclass");
    }
    public void printClass() { super.printClass();
        System.out.println("This is the sub class");
    }
}