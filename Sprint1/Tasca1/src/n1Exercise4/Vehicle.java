package n1Exercise4;

public class Vehicle {

    private static final String FUNCTION = "Move people";
    private final int ID;
    private static int id = 0;

    public Vehicle( ){
        ID = ++id;
    }

    public int getID() {
        return ID;
    }

    public static void showFunction(){
        System.out.println("FUNCTION = " + FUNCTION);
    }

    public static void showId(){
        System.out.println("Muestra el campo static común a todos los objetos de la clase Total de vehículos creados= " + id);
    }


}

