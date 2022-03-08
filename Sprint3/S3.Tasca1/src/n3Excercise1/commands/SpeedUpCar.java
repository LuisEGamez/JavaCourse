package n3Excercise1.commands;

import n3Excercise1.vehicles.Car;

public class SpeedUpCar implements Command {

    private Car car;

    public SpeedUpCar(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.speedUp();
    }
}
