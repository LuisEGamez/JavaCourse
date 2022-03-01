package n1Exercise5;

public class App {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.run();
        cat.run(12);
        cat.run(12, "norte");
        cat.run(12, "norte", 10);
    }
}
