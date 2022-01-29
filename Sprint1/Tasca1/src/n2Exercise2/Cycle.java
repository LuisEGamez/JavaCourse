package n2Exercise2;

public class Cycle {
    private final int numWheels;
    public Cycle() {
        numWheels = 0;
    }

    public static void ride(Cycle cycle){
        System.out.println("El ciclo tiene: " + cycle.wheels() + " ruedas");
    }

    public int wheels(){
        return numWheels;
    }
}
