package n2Excercise1;

import java.io.*;

import java.util.Properties;


public class App {
    public static void main(String[] args) {

        Properties prop = new Properties();

        try {

            prop.load(new FileReader("config.properties"));

        } catch (IOException e) {
            System.out.println("Archivo properties no encontrado");
            e.printStackTrace();
        }

        File ruta = new File(prop.getProperty("Direccion"));
        File rutaTxt = new File(prop.getProperty("DireccionTxt"));

        try {

            ListAndSortContentsDirectory list = new ListAndSortContentsDirectory(rutaTxt);
            list.listAndSotAlphabetic(ruta);

        } catch (IOException e) {
            System.out.println("Error en la creación del archivo Txt");
            e.printStackTrace();
        }

    }
}