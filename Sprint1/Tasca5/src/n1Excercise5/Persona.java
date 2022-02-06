package n1Excercise5;

import java.io.Serializable;

public class Persona implements Serializable {

    private String name, apellido;
    private int edad;

    public Persona(String name, String apellido, int edad) {
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return " Nombre: "+ name + " Apellido "+ apellido + " Edad: " + edad ;
    }
}
