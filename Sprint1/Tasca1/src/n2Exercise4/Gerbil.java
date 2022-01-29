package n2Exercise4;

public class Gerbil extends Rodent{
    public Gerbil() {
    }

    @Override
    public void smell() {
        System.out.println("EL jerbo está oliendo");
    }

    @Override
    public void gnaw() {
        System.out.println("EL jerbo está royendo");
    }

    @Override
    public void run() {
        System.out.println("EL jerbo está corriendo");
    }
}
