package n2Exercise2;

public class Bicycle extends Cycle {
    private final int numWheels;

    public Bicycle() {
        numWheels = 2;
    }

    public int wheels() {
        return numWheels;
    }
}
