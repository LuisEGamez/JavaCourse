package n2Exercise4;

public class Hamster extends Rodent{
    public Hamster() {
    }

    @Override
    public void smell() {
        System.out.println("El hamster está oliendo");
    }

    @Override
    public void gnaw() {
        System.out.println("El hamster está royendo");
    }

    @Override
    public void run() {
        System.out.println("El hamster está corriendo");
    }
}
