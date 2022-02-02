package n3Exercise1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Contenedora contenedora = new Contenedora();
        long startTime = System.nanoTime();

            contenedora.addString("hola");
            contenedora.addString("pepe");
            contenedora.addString("Juan");
            contenedora.addString("Marta");
            contenedora.addString("Maria");
            contenedora.addString("Luis");

        long estimatedTime = System.nanoTime() - startTime;

        List<String> list = new ArrayList<>();
        long startTime2 = System.nanoTime();

            list.add("hola");
            list.add("pepe");
            list.add("Juan");
            list.add("Marta");
            list.add("Maria");
            list.add("Luis");

        long estimatedTime2 = System.nanoTime() - startTime2;


        System.out.println("contenedora = " + contenedora + " Tiempo: " + estimatedTime);
        System.out.println("list = " + list + " Tiempo: " + estimatedTime2);
    }
}
