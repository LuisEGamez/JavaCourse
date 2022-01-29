package n1Excercise2;

public class App {
    public static void main(String[] args) {

        String str = null;
        try {
            System.out.println(str.equalsIgnoreCase("hola"));
        } catch (NullPointerException npe) {
            System.err.println( "NullPointerException: " + npe.getMessage());
        }
    }
}
