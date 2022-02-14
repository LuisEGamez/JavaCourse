package n1Excercise2;

import java.io.File;



public class App {
    public static void main(String[] args) {
        String nameDir = args[0];

        File ruta = new File(nameDir);

        ListAndSortContentsDirectory.listAndSotAlphabetic(ruta);

    }
}