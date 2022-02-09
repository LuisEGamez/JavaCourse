package n1Excercise2;

public class Mujer extends Persona {

    private String sexo;

    public Mujer(String nombre, int edad) {
        super(nombre, edad);
        this.sexo = "Mujer";
    }

    @Deprecated
    public void metodoObsoleto(){

        System.out.println("Este método esta obsoleto");
    }

    @Override
    public String showDatos() {
        return super.showDatos() + "\nSexo: " + sexo;
    }
}
