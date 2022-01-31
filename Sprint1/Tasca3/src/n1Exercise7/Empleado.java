package n1Exercise7;

public class Empleado  {

    private String name;

    public Empleado(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "name='" + name + '\'' +
                '}';
    }
}
