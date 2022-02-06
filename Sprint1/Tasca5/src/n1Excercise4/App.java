package n1Excercise4;

import java.io.File;
import java.io.IOException;


public class App {
    public static void main(String[] args) {

        File ruta = new File(File.separator + "home" + File.separator + "luis"+ File.separator + "Escritorio" + File.separator + "Prueba");
        File rutaTxt = new File(ruta, "Resultado.txt");

        try {

            ListAndSortContentsDirectory list = new ListAndSortContentsDirectory(rutaTxt);
            list.listAndSotAlphabeticTxt(ruta);

        } catch (IOException e) {
            System.out.println("Error en la creación del archivo Txt");
            e.printStackTrace();
        }

    }
}