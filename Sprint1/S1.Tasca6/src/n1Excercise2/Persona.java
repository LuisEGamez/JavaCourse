package n1Excercise2;

class Persona {

    private String nombre;
    private int edad;


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public String toString(){
        return "El empleado se llama " + nombre + ". Tiene " + edad + " años.";
    }
}
