package n1Excercise2;

public class App {
    public static void main(String[] args) {

        GenericMethods.f("hola", 4, new Persona("Luis", 25));

        GenericMethods.f(new Persona("Ana", 45), new Animal("Perro", "Blanco"), 4.52);

    }
}
