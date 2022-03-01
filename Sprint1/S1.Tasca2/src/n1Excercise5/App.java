package n1Excercise5;

import javax.swing.*;


public class App {
    public static void main(String[] args) {

        int num = 0, divi = 0;
        double division = 0;
        String numerador = JOptionPane.showInputDialog("Ingrese el numerador");
        while (divi == 0) {
            try {
                String divisor = JOptionPane.showInputDialog("Ingrese el divisor");
                num = Integer.parseInt(numerador);
                divi = Integer.parseInt(divisor);
                if (divi == 0) {
                    throw new ArithmeticException("El divisor no puede ser 0");
                }
                division = (double) num / divi;
                System.out.println("division = " + division);
            } catch (NumberFormatException e) {
                System.err.println("NumberFormatException: " + e.getMessage() + " introduzca un valor numérico");
            } catch (ArithmeticException ae) {
                System.err.println("ArithmeticException: " + ae.getMessage());
            }
        }
    }
}
