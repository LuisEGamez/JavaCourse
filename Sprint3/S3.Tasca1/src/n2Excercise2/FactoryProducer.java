package n2Excercise2;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        AbstractFactory result = null;
        if (choice.equalsIgnoreCase("enemy")){
            result = new RandomEnemyFactory();
        }else if(choice.equalsIgnoreCase("obstacle")){
            result = new RandomObstacleFactory();
        }
        return result;
    }
}
