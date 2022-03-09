package n1Excercise1;

public class App {

    public static void main(String[] args) {

        Broker broker = new Broker();
        BrokerageHouse brokerageHouse1 = new BrokerageHouse(broker);
        BrokerageHouse brokerageHouse2 = new BrokerageHouse(broker);

        broker.attach(brokerageHouse1);
        broker.attach(brokerageHouse2);

        broker.setState("risen");


    }
}
