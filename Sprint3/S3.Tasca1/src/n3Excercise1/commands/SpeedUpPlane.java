package n3Excercise1.commands;

import n3Excercise1.vehicles.Plane;

public class SpeedUpPlane implements Command {
    
    private Plane plane;

    public SpeedUpPlane(Plane plane) {
        this.plane = plane;
    }

    @Override
    public void execute() {
        plane.speedUp();
    }
}
