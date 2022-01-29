package n1Exercise4;

public class Cliente implements Comparable<Cliente> {

    private String name;
    private int edad;

    public Cliente(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return  "Nombre: " + name + " Edad: " + edad;
    }

    @Override
    public int compareTo(Cliente o) {
        return this.name.compareTo(o.getName());
    }
}
