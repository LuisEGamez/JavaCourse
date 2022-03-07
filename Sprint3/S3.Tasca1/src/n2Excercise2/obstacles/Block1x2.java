package n2Excercise2.obstacles;

import n2Excercise2.Obstacle;

public class Block1x2 implements Obstacle {

    private  int high;
    private int width;

    public Block1x2() {
        high = 1;
        width = 2;
    }

    @Override
    public void spawnObstacle() {
        System.out.println("Bloque generado en pantalla");
    }
}
