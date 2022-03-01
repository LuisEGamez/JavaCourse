package n2Exercise2;

public class App {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        Cycle.ride(unicycle);
        Cycle.ride(bicycle);
        Cycle.ride(tricycle);

    }
}
