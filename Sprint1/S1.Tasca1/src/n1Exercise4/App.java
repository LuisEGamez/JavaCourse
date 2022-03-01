package n1Exercise4;

public class App {
    public static void main(String[] args) {

        Vehicle.showFunction();
        Vehicle.showId();
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.getID());
        Vehicle vehicle2 = new Vehicle();
        System.out.println(vehicle2.getID());
        Vehicle vehicle3 = new Vehicle();
        System.out.println(vehicle3.getID());
        Vehicle.showId();


    }
}
