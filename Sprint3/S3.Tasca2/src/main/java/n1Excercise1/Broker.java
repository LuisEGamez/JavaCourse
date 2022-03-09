package n1Excercise1;

import java.util.ArrayList;
import java.util.List;

public class Broker implements Observable{

    private List<Observer> observerList;
    private String state;

    public Broker() {
        observerList = new ArrayList<>();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(x -> x.update());
    }
}
