package n3Exercise2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Contenedora contenedora = new Contenedora();
        long startTime = System.nanoTime();

            contenedora.addInteger(1);
            contenedora.addInteger(2);
            contenedora.addInteger(3);
            contenedora.addInteger(4);
            contenedora.addInteger(5);
            contenedora.addInteger(6);

        long estimatedTime = System.nanoTime() - startTime;

        List<Integer> list = new ArrayList<>();
        long startTime2 = System.nanoTime();

            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);

        long estimatedTime2 = System.nanoTime() - startTime2;


        System.out.println("contenedora = " + contenedora + " Tiempo: " + estimatedTime);
        System.out.println("list = " + list + " Tiempo: " + estimatedTime2);

        if(estimatedTime > estimatedTime2){
            System.out.println("ArrayList es " + estimatedTime/estimatedTime2 + " veces mas rápida que Contenedora");
        }else if (estimatedTime < estimatedTime2){
            System.out.println("Contenedora es " + estimatedTime2/estimatedTime + " veces mas rápida que ArrayList");
        }else {
            System.out.println("Las dos son igual de rápidas");
        }
    }
}
