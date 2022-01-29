package n1Exercise3;

public class Vehicle {

    static {
        System.out.println("Carga de la clase Vehicle");
    }

    public Vehicle() {
        System.out.println("Instanciamos un objeto vehiculo primero");
    }

    public static void speedUp(){
        System.out.println("Usando el método estático del objeto vehicle");
    }

    public void start(){
        System.out.println("Usando el método start perteneciente al objeto");
    }

}

