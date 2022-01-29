package n1Exercise5;

public class Cat extends Animal{

    public Cat() {

    }

    public void run(int velocidad, String direccion, int tiempo){
        System.out.println("El gato ha estado corriendo a una velocidad de " + velocidad + " Km/h en dirección " + direccion +
                            " durante " + tiempo + " minutos");
    }

}
