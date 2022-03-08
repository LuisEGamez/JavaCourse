package n3Excercise1;

import n3Excercise1.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<Command> commandList;

    public Invoker() {
        commandList = new ArrayList<>();
    }

    public void receiveCommand(Command command){
        commandList.add(command);
    }

    public void makeCommand(){
        commandList.forEach(x -> x.execute());
        commandList.clear();
    }

}
