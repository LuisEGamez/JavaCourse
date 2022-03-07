package n2Excercise2.enemies;

import n2Excercise2.Enemy;

public class Lulu implements Enemy {

    private double ataque;
    private double defensa;

    public Lulu() {
        ataque = 80;
        defensa = 60.4;
    }

    @Override
    public void attack() {
        System.out.println("Lulu ataca");
    }
}
