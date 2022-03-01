package n2Exercise3;

public class Bicycle extends Cycle {
    private final int numWheels;

    public Bicycle() {
        numWheels = 2;
    }

    public int wheels() {
        return numWheels;
    }

    public void balance(){
        System.out.println("Estamos aguantando el equilibrio en un biciclo, sobre " + wheels() + " ruedas");
    }
}
