package n1Excercise3;

import java.io.File;
import java.io.IOException;


public class App {
    public static void main(String[] args) {

        File ruta = new File(File.separator + "home" + File.separator + "luis"+ File.separator + "Escritorio" + File.separator + "Prueba");
        File rutaTxt = new File(File.separator + "home" + File.separator + "luis"+ File.separator + "Escritorio" + File.separator + "Prueba"+File.separator  +"Resultado.txt");

        try {

            ListAndSortContentsDirectory list = new ListAndSortContentsDirectory(rutaTxt);
            list.listAndSotAlphabetic(ruta);

        } catch (IOException e) {
            System.out.println("Error en la creación del archivo Txt");
        }
    }
}