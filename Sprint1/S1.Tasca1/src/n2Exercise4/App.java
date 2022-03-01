package n2Exercise4;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Rodent> rodents = new ArrayList<>();

        Mouse mouse = new Mouse();
        Mouse mouse2 = new Mouse();
        Gerbil gerbil = new Gerbil();
        Gerbil  gerbil2 = new Gerbil();
        Hamster hamster = new Hamster();
        Hamster hamster2 = new Hamster();

        rodents.add(mouse);
        rodents.add(mouse2);
        rodents.add(gerbil);
        rodents.add(gerbil2);
        rodents.add(hamster);
        rodents.add(hamster2);

        for (Rodent rodent : rodents){
            rodent.smell();
            rodent.gnaw();
            rodent.run();
        }

    }
}
