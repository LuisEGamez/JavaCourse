package n3Excercise3;

public class App {
    public static void main(String[] args) {
        FailingConstructor failingConstructor = null;

        try {
            failingConstructor = new FailingConstructor(2, 0);
        }catch (ArithmeticException ae){
            System.out.println("El valor de 'y' no puede ser 0");

        }




    }
}
