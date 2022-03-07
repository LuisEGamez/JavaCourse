package n2Excercise2.obstacles;

import n2Excercise2.Obstacle;

public class Pipe1 implements Obstacle {

    private  int high;
    private int width;

    public Pipe1() {
        high = 1;
        width = 2;
    }

    @Override
    public void spawnObstacle() {
        System.out.println("Tubería generada en pantalla");
    }
}
