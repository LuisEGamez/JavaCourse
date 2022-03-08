package n3Excercise1.vehicles;

public class Plane implements Vehicle {

    @Override
    public void start() {
        System.out.println("El avión está arrancando");
    }

    @Override
    public void speedUp() {
        System.out.println("El avión está acelerando");
    }

    @Override
    public void brake() {
        System.out.println("El avión está frenando");
    }
}
