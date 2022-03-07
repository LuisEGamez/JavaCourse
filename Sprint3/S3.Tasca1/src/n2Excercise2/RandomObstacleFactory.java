package n2Excercise2;

import n2Excercise2.obstacles.Block1x2;
import n2Excercise2.obstacles.Pipe1;

public class RandomObstacleFactory implements AbstractFactory{
    @Override
    public Enemy getRandomEnemy() {
        return null;
    }

    @Override
    public Obstacle getRandomObstacle() {
        Obstacle result;
        double num =  Math.random();
        if(num >= 0.5){
            result = new Pipe1();
        }else {
            result = new Block1x2();
        }
        return result;
    }
}
