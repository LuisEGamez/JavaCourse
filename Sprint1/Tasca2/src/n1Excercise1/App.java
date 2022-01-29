package n1Excercise1;

public class App {
    public static void main(String[] args) {

        double divi = 0;
        double division;

        try{
            if (divi == 0){
                throw new Exception("Ingrese un numero mayor que cero");
            }
            division = 5/divi;
            System.out.println("division = " + division);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Siempre pasamos por el finally");
        }

    }
}
