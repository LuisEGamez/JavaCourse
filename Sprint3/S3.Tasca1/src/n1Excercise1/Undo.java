package n1Excercise1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instancia;
    private List<String> comandos;

    private Undo(){
        comandos = new ArrayList<>();
    }

    public static Undo getInstance(){
        if(instancia == null){
            instancia = new Undo();
        }
        return instancia;
    }

    public void addCommands(String command){
        comandos.add(command);
    }

    public void rmCommands(String command){
        comandos.remove(command);
    }

    public void showUndoList(){
        for(String command: comandos){
            System.out.println(command);
        }
    }


}
