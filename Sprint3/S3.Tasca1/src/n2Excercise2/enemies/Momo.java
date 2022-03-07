package n2Excercise2.enemies;

import n2Excercise2.Enemy;

public class Momo implements Enemy {

    private double ataque;
    private double defensa;

    public Momo() {
        ataque = 120;
        defensa = 88;
    }

    @Override
    public void attack() {
        System.out.println("Momo ataca");
    }
}
