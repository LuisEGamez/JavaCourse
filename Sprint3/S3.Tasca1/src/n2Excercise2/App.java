package n2Excercise2;

public class App {

    public static void main(String[] args) {

        AbstractFactory enemyFactory = FactoryProducer.getFactory("enemy");
        AbstractFactory obstacleFactory = FactoryProducer.getFactory("obstacle");

        Enemy enemy = enemyFactory.getRandomEnemy();
        Enemy enemy1 = enemyFactory.getRandomEnemy();
        enemy.attack();
        enemy1.attack();

        Obstacle obstacle = obstacleFactory.getRandomObstacle();
        Obstacle obstacle1 = obstacleFactory.getRandomObstacle();

        obstacle.spawnObstacle();
        obstacle1.spawnObstacle();



    }

}
