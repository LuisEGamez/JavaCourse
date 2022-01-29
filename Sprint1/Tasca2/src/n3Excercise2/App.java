package n3Excercise2;

public class App {
    public static void main(String[] args) {
        try {
            FailingConstructor failingConstructor = new FailingConstructor(2, 0);
        }catch (ArithmeticException ae){
            System.out.println("El valor de 'y' no puede ser 0");
            ae.printStackTrace(System.out);
            System.out.println(ae.getClass().getName());
        }
    }
}
