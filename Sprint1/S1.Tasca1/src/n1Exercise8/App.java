package n1Exercise8;

public class App {

    public static void main(String[] args) {

        Frog frog = new Frog();

        ((Amphibian) frog).move();
        ((Amphibian) frog).breathe();
        ((Amphibian) frog).eat();

        frog.move();
        frog.breathe();
        frog.breathe();
        frog.jump();


    }
}
