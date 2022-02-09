package n1Excercise2;

public class App {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 45);
        Hombre hombre = new Hombre("Antonio", 85);
        Mujer mujer = new Mujer("Ana", 45);

        System.out.println(persona.showDatos());
        System.out.println(hombre.showDatos());
        System.out.println(mujer.showDatos());


    }
}
