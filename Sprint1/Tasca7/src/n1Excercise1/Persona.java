package n1Excercise1;

public class Persona {

    private String nombre;
    private int edad;


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String showDatos(){
        return "Nombre " + nombre + ". Tiene " + edad + " años.";
    }
}
