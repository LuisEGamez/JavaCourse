package n2Exercise1;


import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        Queue<Numero> numeros = new PriorityQueue<>();

        for (int i = 0; i < 5; i++) {
            numeros.add(new Numero());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros.poll());
        }

    }
}
