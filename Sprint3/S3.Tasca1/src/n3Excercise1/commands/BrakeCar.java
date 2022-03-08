package n3Excercise1.commands;

import n3Excercise1.vehicles.Car;

public class BrakeCar implements Command {

    private Car car;

    public BrakeCar(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.brake();
    }
}
