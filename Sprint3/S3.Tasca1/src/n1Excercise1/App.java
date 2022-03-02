package n1Excercise1;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

       menu();

    }

    static void menu() {
        String choice;
        do {
            choice = JOptionPane.showInputDialog("Elija una opción (1-4)" +
                    "\n1ª Añadir comando." +
                    "\n2ª Eliminar comando." +
                    "\n3ª Listar comandos.");
            try {
            if (!isBetween1and3(choice)){
                System.out.println("Elija un opción correcta");
            }else {
                    options(choice);
                }
            }catch (NullPointerException npe){
                System.out.println("Programa cerrado");
                }
        } while (choice!=null);
    }

    static void options(String choice){
        Undo undo = Undo.getInstance();
        switch (choice) {
            case "1" -> undo.addCommands(JOptionPane.showInputDialog("Introduzca un comando"));
            case "2" -> undo.rmCommands(JOptionPane.showInputDialog("Introduzca un comando"));
            case "3" -> undo.showUndoList();
        }
    }

    static boolean isBetween1and3(String choice){
        return choice.equalsIgnoreCase("1") || choice.equalsIgnoreCase("2") ||
                choice.equalsIgnoreCase("3");
    }
}


