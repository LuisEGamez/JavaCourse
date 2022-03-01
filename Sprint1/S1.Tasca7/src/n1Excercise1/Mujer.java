package n1Excercise1;

public class Mujer extends Persona{

    private String sexo;

    public Mujer(String nombre, int edad) {
        super(nombre, edad);
        this.sexo = "Mujer";
    }

    @Override
    public String showDatos() {
        return super.showDatos() + "\nSexo: " + sexo;
    }
}
