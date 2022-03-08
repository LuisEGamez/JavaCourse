package n3Excercise1;

import n3Excercise1.commands.*;
import n3Excercise1.vehicles.*;

public class App {

    public static void main(String[] args) {
        Car car = new Car();
        Plane plane = new Plane();

        StartCar startCar = new StartCar(car);
        SpeedUpCar speedUpCar = new SpeedUpCar(car);
        BrakeCar brakeCar = new BrakeCar(car);
        StartPlane startPlane = new StartPlane(plane);
        SpeedUpPlane speedUpPlane = new SpeedUpPlane(plane);
        BrakePlane brakePlane = new BrakePlane(plane);

        Invoker invoker = new Invoker();
        invoker.receiveCommand(startCar);
        invoker.receiveCommand(speedUpCar);
        invoker.receiveCommand(brakeCar);
        invoker.receiveCommand(startPlane);
        invoker.receiveCommand(speedUpPlane);
        invoker.receiveCommand(brakePlane);

        invoker.makeCommand();
    }
}
