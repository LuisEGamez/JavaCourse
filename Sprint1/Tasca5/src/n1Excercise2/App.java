package n1Excercise2;

import java.io.File;



public class App {
    public static void main(String[] args) {

        File ruta = new File(File.separator + "home" + File.separator + "luis"+ File.separator + "Escritorio" + File.separator + "Prueba");

        ListAndSortContentsDirectory.listAndSotAlphabetic(ruta);

    }
}