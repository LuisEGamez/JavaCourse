package n2Excercise2.enemies;

import n2Excercise2.Enemy;

public class Bubu implements Enemy {

    private double ataque;
    private double defensa;

    public Bubu() {
        ataque = 60;
        defensa = 20;
    }

    @Override
    public void attack() {
        System.out.println("Bubu ataca");
    }
}
