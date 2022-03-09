package n1Excercise1;

public class BrokerageHouse implements Observer{

    private Observable observable;

    public BrokerageHouse(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("The stock market has " + ((Broker) observable).getState());
    }
}
