package n1Exercise8;

public class Persona {

    private String name;
    private int edad;

    public Persona(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return " Nombre: "+ name + " Edad: " + edad ;
    }
}
