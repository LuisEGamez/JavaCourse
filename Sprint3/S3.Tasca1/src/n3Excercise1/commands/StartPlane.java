package n3Excercise1.commands;

import n3Excercise1.vehicles.Plane;

public class StartPlane implements Command {

    private Plane plane;

    public StartPlane(Plane plane) {
        this.plane = plane;
    }

    @Override
    public void execute() {
        plane.start();
    }
}
