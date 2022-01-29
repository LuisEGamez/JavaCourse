package n1Exercise6;

public class App {

    public static void main(String[] args) {

        Frog frog = new Frog();

        ((Amphibian) frog).move();
        ((Amphibian) frog).breathe();
        ((Amphibian) frog).eat();


    }
}
