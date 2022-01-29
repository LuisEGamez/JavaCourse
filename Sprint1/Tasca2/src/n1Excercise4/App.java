package n1Excercise4;

import javax.swing.*;


public class App {
    public static void main(String[] args) {


        String numerador = JOptionPane.showInputDialog("Ingrese el numerador");
        String divisor = JOptionPane.showInputDialog("Ingrese el divisor");
        int num = 0, divi = 0;
        double division=0;

        try {
            num  = Integer.parseInt(numerador);
            divi = Integer.parseInt(divisor);
            if(num < 0 || num >5 || divi < 0 || divi > 5){
                throw new FueraRangoException();
                }
            if(divi ==0){
                throw new ArithmeticException("El divisor no puede ser 0");
            }
            division =(double) num/  divi;
            System.out.println("division = " + division);
        }catch (NumberFormatException e) {
            System.err.println("Introduzca un valor numérico");
        }catch (FueraRangoException r){
            System.err.println("FueraRandoException: " + r.getMessage());
        }catch (ArithmeticException ae){
            System.err.println(ae.getMessage());
        }
    }
}
