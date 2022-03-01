package n3Excercise2;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int x = 0, y=0;
        x= Integer.parseInt(JOptionPane.showInputDialog("Introduzca valor de X"));
        while(y==0) {
            y= Integer.parseInt(JOptionPane.showInputDialog("Introduzca valor de Y"));
            try {
                FailingConstructor failingConstructor = new FailingConstructor(x, y);
                System.out.println("Z = " + failingConstructor.getZ());
            } catch (ArithmeticException ae) {
                System.out.println("El valor de 'y' no puede ser 0");
                System.out.println(ae.getClass().getName());
            }
        }
    }
}
