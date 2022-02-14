package n1Excercise5;

import java.io.*;

public class App {
    public static void main(String[] args) {
            String nameFileSeri = args[0];
            Persona persona = new Persona("Juan","Garcia",55);
            ObjectOutputStream writeObj = null;
            ObjectInputStream readObj = null;

            //Serializamos el objeto y lo guardamos en la ruta deseada con el formato deseado

        try {
            writeObj = new ObjectOutputStream(new FileOutputStream(nameFileSeri));
            writeObj.writeObject(persona);

            readObj = new ObjectInputStream(new FileInputStream(nameFileSeri));
            Persona personaRecuperada = (Persona) readObj.readObject(); // Realizamos un cast para poder guardarlo en una variable de su clase.
            System.out.println("Objeto recuperado  = " + personaRecuperada);

        } catch (IOException e) {
            System.out.println("Error al serializar el objeto");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Objeto no encontrado");
            e.printStackTrace();
        } finally {
            try {
                if(writeObj!=null) {
                    writeObj.close();
                }
                if (readObj!=null){
                    readObj.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar Streams");
            }
        }

    }
}
