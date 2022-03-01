package n2n3Excercise1;

import java.io.IOException;

public class App {

    public static void main(String[] args) {

        Persona persona = new Persona("Luis", 29, new String[]{"Escalar, Patinar, Programación"});

        String json = MyJson.createJson(persona);

        System.out.println(json);

        try {
            MyJson.createJsonFile(json);
        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            System.out.println("Ha fallado la captura del método");
            e.printStackTrace();
        }

    }
}
