package n3Excercise1.commands;

import n3Excercise1.vehicles.Plane;

public class BrakePlane implements Command {
    
    private Plane plane;

    public BrakePlane(Plane plane) {
        this.plane = plane;
    }

    @Override
    public void execute() {
        plane.brake();
    }
}
