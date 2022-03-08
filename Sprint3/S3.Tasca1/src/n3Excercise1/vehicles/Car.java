package n3Excercise1.vehicles;

public class Car implements Vehicle {


    @Override
    public void start() {
        System.out.println("El coche está arrancando");
    }

    @Override
    public void speedUp() {
        System.out.println("El coche está acelerando");
    }

    @Override
    public void brake() {
        System.out.println("El coche esta frenando");
    }
}
