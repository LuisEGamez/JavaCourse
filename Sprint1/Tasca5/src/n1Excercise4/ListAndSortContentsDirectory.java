package n1Excercise4;

import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class ListAndSortContentsDirectory {

    private FileWriter writer;
    private BufferedWriter myBufferedWriter;
    private BufferedReader myBufferedReader;

    public ListAndSortContentsDirectory(File rutaTxt) throws IOException {
        writer = new FileWriter(rutaTxt);
        myBufferedWriter = new BufferedWriter(writer);
    }

    public void listAndSotAlphabeticTxt(File ruta) throws IOException {

        Date date;
        String[] lista = createSortArray(ruta);

        for (String str : lista){

            File file = new File(ruta,str);

            if (file.isFile()){

                readTxt(file);
                date = new Date(file.lastModified());
                System.out.println("Fichero: " + str +" ultima modificación: " + date);
                writeTxt("Fichero: " + str +" ultima modificación: " + date);

            }else {

                System.out.println("Directorio: " + str);
                writeTxt("Directorio: " + str);
                listAndSotAlphabeticTxt(file);

            }
        }
    }

    public void writeTxt(String linea) throws IOException { // Creamos un Buffer que va escribiendo línea por línea el contenido
        myBufferedWriter.write(linea);
        myBufferedWriter.newLine();
        myBufferedWriter.flush();
    }

    public String[] createSortArray(File ruta){ // Ordenamos la Array de String que nos devuelve el método list
        String[] lista = ruta.list();
        Arrays.sort(lista);
        return lista;
    }

    public void readTxt(File file) throws IOException { // Leemos todos los Txt que haya en la dirección
        String linea = "";
        if(file.getName().endsWith(".txt")){
            myBufferedReader = new BufferedReader(new FileReader(file));
            System.out.println("Fichero " + file.getName() + " Contenido: ");
            while (linea!=null){
                linea = myBufferedReader.readLine();

                if (linea!=null) {
                    System.out.println(linea);
                }
            }
        linea = ""; // Necesitamos hacer un reset de la variable después de leer un fichero, ya que si el siguiente es otro fichero no lo leerá
        }
    }

}