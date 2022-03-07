package n2Excercise1;

public class FactoryProducer {

    public static AbstractFactory getFactory(String typeFactory){
        AbstractFactory result = null;
        if (typeFactory.equalsIgnoreCase("Agenda")){
            result = new AgendaFactory();
        }else if (typeFactory.equalsIgnoreCase("Adress")){
            result = new AdressFactory();
        }else if(typeFactory.equalsIgnoreCase("PhoneNumber")){
            result = new PhoneNumFactory();
        }
        return result;
    }


}
