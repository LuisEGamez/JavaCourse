package n1Exercise5;

public class Animal {

    public Animal(){

    }

    public void run(){
        System.out.println("El animal esta corriendo!");
    }

    public void run(int velocidad){
        System.out.println("El animal esta corriendo a una velocidad de " + velocidad + " Km/h");
    }

    public void run(int velocidad, String direccion){
        System.out.println("El animal esta corriendo a una velocidad de " + velocidad + " Km/h en dirección " + direccion);
    }
}
