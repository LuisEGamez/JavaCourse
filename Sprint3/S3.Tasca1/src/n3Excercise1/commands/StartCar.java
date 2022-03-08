package n3Excercise1.commands;

import n3Excercise1.vehicles.Car;

public class StartCar implements Command {

    private Car car;

    public StartCar(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.start();
    }
}
