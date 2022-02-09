package n1Excercise2;

public class Hombre extends Persona {

    private String sexo;

    public Hombre(String nombre, int edad) {
        super(nombre, edad);
        this.sexo = "Varón";
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
