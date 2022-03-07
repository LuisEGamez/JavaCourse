package n2Excercise2;

import n2Excercise2.enemies.Bubu;
import n2Excercise2.enemies.Lulu;
import n2Excercise2.enemies.Momo;

public class RandomEnemyFactory implements AbstractFactory {


    @Override
    public Enemy getRandomEnemy() {
        Enemy result;
        double num =  Math.random();
        if(num > 0.66){
            result = new Bubu();
        }else if (num < 0.33){
            result = new Lulu();
        }else {
            result = new Momo();
        }
        return result;
    }

    @Override
    public Obstacle getRandomObstacle() {
        return null;
    }
}
