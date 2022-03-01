package n2Exercise3;

public class Unicycle extends Cycle {
    private final int numWheels;

    public Unicycle() {
        numWheels = 1;
    }

    public int wheels() {
        return numWheels;
    }

    public void balance(){
        System.out.println("Estamos aguantando el equilibrio en un uniciclo, sobre " + wheels() + " rueda");
    }
}
