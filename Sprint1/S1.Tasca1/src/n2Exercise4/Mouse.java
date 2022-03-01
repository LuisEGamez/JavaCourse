package n2Exercise4;

public class Mouse extends Rodent{
    public Mouse() {
    }

    @Override
    public void smell() {
        System.out.println("El ratón está oliendo");
    }

    @Override
    public void gnaw() {
        System.out.println("El ratón esta royendo");
    }

    @Override
    public void run() {
        System.out.println("El ratón esta corriendo");
    }
}
