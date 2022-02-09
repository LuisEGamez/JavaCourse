package n1Excercise1;

public class Hombre extends Persona{

    private String sexo;

    public Hombre(String nombre, int edad) {
        super(nombre, edad);
        this.sexo = "Varón";
    }

    @Override
    public String showDatos() {
        return super.showDatos() + "\nSexo: " + sexo;
    }
}
