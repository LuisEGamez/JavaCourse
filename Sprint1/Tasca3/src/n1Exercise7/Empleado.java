package n1Exercise7;



public class Empleado implements Comparable<Empleado> {

    private String name;

    public Empleado(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name ;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Empleado o) {
        return name.hashCode()-o.name.hashCode();
    }


}
