package n1Excercise1;

public interface Observable {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
